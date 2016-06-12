package com.zf.base;

import org.springframework.context.ApplicationContext;

/**
 * Cons
 *
 * @author zf
 * @date 16/3/12
 */
public class Constans {

    private static final int pageSize = 30;

    public static final String WECHATPAY = "wechatpay";

    public static final String PAGE = "admin/config/PAGE.txt"; // 分页条数配置路径
    public static final String SMS1 = "admin/config/SMS1.txt"; // 短信账户配置路径1
    public static final String SMS2 = "admin/config/SMS2.txt"; // 短信账户配置路径2
    public static final String FILEPATHIMGDIR = "ftpdir/";
    public static final String USERFILEPATHIMG = "aoshimall/user"; // 用户图片上传路径
    public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(code)|(app)|(weixin)|(static)|(main)|(websocket)).*"; // 不对匹配该值的访问路径拦截（正则）
    public static final String NO_LOG_PATH = ".*/((plugins)|(tab)|(head)).*"; // 不对匹配该值的访问路径记录日志（正则）

    public static ApplicationContext WEB_APP_CONTEXT = null; // 该值会在web容器启动时由WebAppContextListener初始化

    public static final String SUCCESS = "success";
    public static final String FAILURE = "failure";
    public static final String EXPIRED = "expired";

    public static final String SALT = "aoshi";
    public static final String GROUPNAME = "aoshiAuction";
    /**
     * 图片上传路径
     */
    public static final String ORDER_IMG_PATH = "wholesaleManage/orderImg/";
}

