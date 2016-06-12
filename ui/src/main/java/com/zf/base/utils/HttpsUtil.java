package com.zf.base.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 类名称：HttpsUtil 创建人：star 创建时间：2016-03-01
 */
public class HttpsUtil {

    protected Logger logger = Logger.getLogger(this.getClass());

    //表示请求器是否已经做了初始化工作
    private boolean hasInit = false;

    //连接超时时间，默认10秒
    private int socketTimeout = 10000;

    //传输超时时间，默认30秒
    private int connectTimeout = 30000;

    //请求器的配置
    private RequestConfig requestConfig;

    //HTTP请求器
    private CloseableHttpClient httpClient;

    public HttpsUtil() {
        init();
    }

    private void init() {
        httpClient = HttpClients.custom().build();

        //根据默认超时限制初始化requestConfig
        requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();

        hasInit = true;
    }

    /**
     * 通过Https往API get map数据
     *
     * @param url
     *            API地址
     * @param
     *            params
     * @return API回包的实际数据
     * @throws IOException
     * @throws KeyStoreException
     * @throws UnrecoverableKeyException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */

    public String sendGet(String url, Map<String, String> params) {

        if (!hasInit) {
            init();
        }

        String result = null;

        logger.info("API，POST过去的数据是：");
        logger.info(params);

        String parameters = "";
        if (params != null && !params.isEmpty()) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String name = entry.getKey();
                String value = entry.getValue();
                parameters = parameters + name + "=" + value + "&";
            }
            parameters = parameters.substring(0, parameters.length() - 1);
        }

        HttpGet httpGet = new HttpGet(url + "?" + parameters);
        //设置请求器的配置
        httpGet.setConfig(requestConfig);

        logger.info("executing request" + httpGet.getRequestLine());

        try {
            HttpResponse response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();

            result = EntityUtils.toString(entity, "UTF-8");

        } catch (ConnectionPoolTimeoutException e) {
            logger.error("http get throw ConnectionPoolTimeoutException(wait time out)", e);
        } catch (ConnectTimeoutException e) {
            logger.error("http get throw ConnectTimeoutException", e);
        } catch (SocketTimeoutException e) {
            logger.error("http get throw SocketTimeoutException", e);
        } catch (Exception e) {
            logger.error("http get throw Exception", e);
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            httpGet.abort();
        }

        return result;
    }

    /**
     * 通过Https往API post xml数据
     *
     * @param url
     *            API地址
     * @param
     *            要提交的XML数据对象
     * @return API回包的实际数据
     * @throws IOException
     * @throws KeyStoreException
     * @throws UnrecoverableKeyException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */

    public String sendPost(String url, Map<String, Object> map) {

        if (!hasInit) {
            init();
        }

        String result = null;

        HttpPost httpPost = new HttpPost(url);

        logger.info("API，POST过去的数据是：");
        logger.info(map);

        List<BasicNameValuePair> parameters = new ArrayList<BasicNameValuePair>();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String name = entry.getKey();
                String value = String.valueOf(entry.getValue());
                BasicNameValuePair valuePair = new BasicNameValuePair(name, value);
                parameters.add(valuePair);
            }
        }
        UrlEncodedFormEntity encodedFormEntity;
        try {
            encodedFormEntity = new UrlEncodedFormEntity(parameters, "UTF-8");
            httpPost.setEntity(encodedFormEntity);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //设置请求器的配置
        httpPost.setConfig(requestConfig);

        logger.info("executing request" + httpPost.getRequestLine());

        try {
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity, "UTF-8");
        } catch (ConnectionPoolTimeoutException e) {
            logger.error("http get throw ConnectionPoolTimeoutException(wait time out)", e);
        } catch (ConnectTimeoutException e) {
            logger.error("http get throw ConnectTimeoutException", e);
        } catch (SocketTimeoutException e) {
            logger.error("http get throw SocketTimeoutException", e);
        } catch (Exception e) {
            logger.error("http get throw Exception", e);
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            httpPost.abort();
        }
        return result;
    }

    /**
     * 设置连接超时时间
     *
     * @param socketTimeout
     *            连接时长，默认10秒
     */
    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
        resetRequestConfig();
    }

    /**
     * 设置传输超时时间
     *
     * @param connectTimeout
     *            传输时长，默认30秒
     */
    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
        resetRequestConfig();
    }

    private void resetRequestConfig() {
        requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();
    }

    /**
     * 允许商户自己做更高级更复杂的请求器配置
     *
     * @param requestConfig
     *            设置HttpsRequest的请求器配置
     */
    public void setRequestConfig(RequestConfig requestConfig) {
        this.requestConfig = requestConfig;
    }
}
