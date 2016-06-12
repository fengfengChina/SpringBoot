package com.zf.base.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

/**
 * Created by zengfeng on 5/5/16.
 */
public class FtpConManager {
    protected Logger logger = Logger.getLogger(this.getClass());
    private static FtpConManager instance;
    private FTPClient ftpClient = null;

    /**
     * get FtpConManager
     *
     * @return FtpConManager
     */
    public synchronized static FtpConManager getInstance() {
        if (instance == null) {
            instance = new FtpConManager();
        }
        return instance;
    }

    /**
     * <p>
     * ftp登录
     * </p>
     *
     * @param s_url ftp服务地址
     * @param uname 用户名
     * @param pass  密码
     */
    public void login(String s_url, String uname, String pass) throws Exception {
        ftpClient = new FTPClient();
        try {
            // 连接
            ftpClient.setDefaultTimeout(30000);
            ftpClient.connect(s_url);

            ftpClient.login(uname, pass);
            // 检测连接是否成功
            int reply = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                this.closeCon();
                logger.debug("FTP server refused connection.");
                System.exit(1);
            }

        } catch (Exception ex) {
            logger.debug(ex.toString(), ex);
            // 关闭
            this.closeCon();
        }
    }

    /**
     * <p>
     * ftp上传文件
     * </p>
     *
     * @param is          须上传文件
     * @param targetFname 生成目标文件
     * @return true||false
     */
    public boolean uploadFileByInputStream(InputStream is, String filePath, String targetFname) {
        boolean flag = false;
        if (ftpClient != null) {
            try {
                //this.CreateDirecroty(filePath);
                // 设置上传目录
                ftpClient.changeWorkingDirectory(filePath);
                ftpClient.setBufferSize(1024);
                ftpClient.setControlEncoding("GBK");

                // 设置文件类型（二进制）
                ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
                ftpClient.enterLocalPassiveMode();
                // 上传
                flag = ftpClient.storeFile(targetFname, is);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("FTP server refused connection.", e);
                this.closeCon();
            } finally {
                IOUtils.closeQuietly(is);
            }
        }
        return flag;
    }// end method uploadFile

    /**
     * 上传多文件
     *
     * @param files
     * @param filePath
     * @return
     */
    public void uploadManyFileByInputStream(List<Map<String, Object>> files, String filePath) {
        if (ftpClient != null) {
            try {
                this.CreateDirecroty(filePath);
                // 设置上传目录
                ftpClient.changeWorkingDirectory(filePath);
                ftpClient.setBufferSize(1024);
                ftpClient.setControlEncoding("GBK");

                // 设置文件类型（二进制）
                ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
                ftpClient.enterLocalPassiveMode();
                // 上传
                for (Map<String, Object> map : files) {
                    ftpClient.storeFile((String) map.get("ftpFile"), (InputStream) map.get("is"));
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("FTP server refused connection.", e);
                this.closeCon();
            }
        }
    }// end method uploadFile

    /**
     * <p>
     * ftp上传文件
     * </p>
     *
     * @param srcUrl      须上传文件
     * @param targetFname 生成目标文件
     * @return true||false
     */
    public boolean uploadFile(String srcUrl, String filePath, String targetFname) {
        boolean flag = false;
        if (ftpClient != null) {
            File srcFile = new File(srcUrl);

            FileInputStream fis = null;
            try {
                fis = new FileInputStream(srcFile);

                // String extName = ""; // 扩展名格式：
                //
                // if (file.getOriginalFilename().lastIndexOf(".") >= 0){
                // extName =
                // file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
                // }

                this.CreateDirecroty(filePath);
                // 设置上传目录
                ftpClient.changeWorkingDirectory(filePath);
                ftpClient.setBufferSize(1024);
                ftpClient.setControlEncoding("GBK");
                ftpClient.enterLocalPassiveMode();

                // 设置文件类型（二进制）
                ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
                // 上传
                flag = ftpClient.storeFile(targetFname, fis);
            } catch (Exception e) {
                logger.error("FTP server refused connection.", e);
                this.closeCon();
            } finally {
                IOUtils.closeQuietly(fis);
            }
        }
        return flag;
    }// end method uploadFile

    /** */
    /**
     * 递归创建远程服务器目录
     *
     * @param remote 远程服务器文件绝对路径
     * @return 目录创建是否成功
     * @throws IOException
     */
    public boolean CreateDirecroty(String remote) throws IOException {
        boolean success = true;
        // String directory = remote.substring(0, remote.lastIndexOf("/") + 1);
        String directory = remote + "/";
        // 如果远程目录不存在，则递归创建远程服务器目录
        if (!directory.equalsIgnoreCase("/") && !ftpClient.changeWorkingDirectory(new String(directory))) {
            int start = 0;
            int end = 0;
            if (directory.startsWith("/")) {
                start = 1;
            } else {
                start = 0;
            }
            end = directory.indexOf("/", start);
            while (true) {
                String subDirectory = new String(remote.substring(start, end));
                if (!ftpClient.changeWorkingDirectory(subDirectory)) {
                    if (ftpClient.makeDirectory(subDirectory)) {
                        ftpClient.changeWorkingDirectory(subDirectory);
                    } else {
                        System.out.println("创建目录失败");
                        success = false;
                        return success;
                    }
                }
                start = end + 1;
                end = directory.indexOf("/", start);
                // 检查所有目录是否创建完毕
                if (end <= start) {
                    break;
                }
            }
        }
        return success;

    }

    public boolean createDir(String dirname) {
        boolean flag = false;
        try {
            flag = ftpClient.makeDirectory(dirname);
        } catch (Exception ex) {
            logger.error(ex.toString(), ex);
        }
        return flag;
    }

    public static void logBefore(Logger logger, String interfaceName) {
        logger.info("");
        logger.info("start");
        logger.info(interfaceName);
    }

    public static void logAfter(Logger logger) {
        logger.info("end");
        logger.info("");
    }

    /**
     * <p>
     * 删除ftp上的文件
     * </p>
     *
     * @param srcFname
     * @return true || false
     */
    public boolean removeFile(String srcFname) {
        boolean flag = false;
        if (ftpClient != null) {
            try {
                flag = ftpClient.deleteFile(srcFname);
            } catch (IOException e) {
                logger.error(e.toString(), e);
                this.closeCon();
            }
        }
        return flag;
    }

    public FTPFile[] getFiles(String pathname) {
        FTPFile[] files = null;
        try {
            ftpClient.setControlEncoding("GBK");
            ftpClient.enterLocalPassiveMode();
            files = ftpClient.listFiles(pathname);
        } catch (IOException e) {
            logger.error(e.toString(), e);
            this.closeCon();
        }
        return files;
    }

    /**
     * <p>
     * 销毁ftp连接
     * </p>
     */
    public void closeCon() {
        if (ftpClient != null) {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.logout();
                    ftpClient.disconnect();
                } catch (IOException e) {
                    logger.error(e.toString(), e);
                }
            }
        }
    }
}
