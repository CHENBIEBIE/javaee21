package com.kaishengit.uitl;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import javax.servlet.http.HttpServlet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/6/21.
 */
public class HttpUitl  extends HttpServlet{

   public static String getRequestTest(String url){

       CloseableHttpClient httpClient = HttpClients.createDefault();



       try {

           HttpGet httpGet = new HttpGet(url);
           //HttpResponse httpResponse = httpClient.execute(httpGet);
           HttpResponse httpResponse = httpClient.execute(httpGet);

           int httpCode = httpResponse.getStatusLine().getStatusCode();
           if (httpCode==200){

               InputStream inputStream =httpResponse.getEntity().getContent();

               String html = IOUtils.toString(inputStream);
               return html;


           }else {
               System.out.println("请求异常" + httpCode);
           }

           httpClient.close();
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           try {
               httpClient.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

       return null;

   }
}
