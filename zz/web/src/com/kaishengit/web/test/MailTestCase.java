package com.kaishengit.web.test;

import com.kaishengit.web.utli.EmailUtil;
import org.apache.commons.mail.*;
import org.junit.Test;

/**
 * Created by Administrator on 2016/6/15.
 */
public class MailTestCase {

    @Test
    public void sentTestMail(){

        SimpleEmail mail = new SimpleEmail();
        mail.setAuthentication("kaishengit","p@ssw@rd");
        mail.setHostName("smtp.126.com");
        mail.setSmtpPort(25);
        mail.setCharset("utf-8");

        try {
            mail.setFrom("kaishengit@126.com");
            mail.setSubject("今天阳光明媚适合度日光假");
            mail.setMsg("早上喝了牛奶加咖啡");

            mail.addTo("duchengyan@yeah.net");
            mail.send();
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    @Test
    public void sendHtmlMai(){

        HtmlEmail mail = new  HtmlEmail();
        mail.setAuthentication("kaishengit","p@ssw@rd");
        mail.setHostName("smtp.126.com");
        mail.setSmtpPort(25);
        mail.setCharset("utf-8");

        try {
            mail.setFrom("kaishengit@126.com");
            mail.setSubject("duchengyan@yeah.net");
            mail.setHtmlMsg("<div style=\"color:red\">中午来我办公室</div>");

            mail.addTo("duchengyan@yeah.net");
            mail.send();
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }

    @Test
    public void sendAttachMail(){

        EmailAttachment emailAttachment = new EmailAttachment();
        emailAttachment.setPath("D:/1.jpg");

        MultiPartEmail mail = new MultiPartEmail();
        mail.setAuthentication("q3359255672","hongjun1");
        mail.setHostName("smtp.126.com");
        mail.setSmtpPort(25);
        mail.setCharset("utf-8");

        try {
            mail.setFrom("q3359255672@126.com");
            mail.setSubject("附件是一张图片");
            mail.setMsg("内容见附件");

            mail.addTo("921212200@qq.com");


            mail.attach(emailAttachment);
            mail.send();

        } catch (Exception e) {

           throw new RuntimeException(e);
        }


    }

    @Test
    public void testSendHtmlMail(){
        EmailUtil.sendHtmlMail("921212200@qq.com","今天下午来我办公室","<h3>hi >>_<<</h3>");
    }
}
