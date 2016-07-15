package com.kaishengit.test;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/6/21.
 */
public class HttpClientTestCase {


    @Test
    public void testDownloadImage() throws IOException {


        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://f10.topitme.com/o/201103/08/12995904841672.jpg");



        //HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpResponse httpResponse = httpClient.execute(httpGet);

        int httpCode = httpResponse.getStatusLine().getStatusCode();
        if (httpCode==200){

            InputStream inputStream =httpResponse.getEntity().getContent();

            FileOutputStream OutputStream = new FileOutputStream("D:/uuu.jpg");

            IOUtils.copy(inputStream,OutputStream);

            OutputStream.flush();
            OutputStream.close();
            inputStream.close();


        }else {
            System.out.println("请求异常" + httpCode);
        }

        httpClient.close();

    }



    @Test
    public void testGetRequest() throws IOException {


        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://blog.sina.com.cn/rss/1220218113.xml");



        //HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpResponse httpResponse = httpClient.execute(httpGet);

        int httpCode = httpResponse.getStatusLine().getStatusCode();
        if (httpCode==200){

            InputStream inputStream =httpResponse.getEntity().getContent();

            String html = IOUtils.toString(inputStream);
            System.out.println(html);

        }else {
            System.out.println("请求异常" + httpCode);
        }

        httpClient.close();

    }
}
