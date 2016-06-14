package com.kaishengit.web.test;


import org.junit.Test;
import org.patchca.color.SingleColorFactory;
import org.patchca.filter.ConfigurableFilterFactory;
import org.patchca.filter.predefined.CurvesRippleFilterFactory;
import org.patchca.font.FontFactory;
import org.patchca.service.ConfigurableCaptchaService;
import org.patchca.utils.encoder.EncoderHelper;
import org.patchca.word.RandomWordFactory;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.UUID;

public class MyTestCase {

    @Test
    public void testUUID(){
        UUID uuid = UUID.randomUUID();
        String key = uuid.toString();
        System.out.println(key);
    }
    @Test
    public void testCaptcha() throws Exception {

        ConfigurableCaptchaService cs = new ConfigurableCaptchaService();
        cs.setColorFactory(new SingleColorFactory(new Color(67,78,170)));
        cs.setFilterFactory(new CurvesRippleFilterFactory(cs.getColorFactory()));

        RandomWordFactory factory = new RandomWordFactory();
        factory.setMinLength(4);
        factory.setMaxLength(4);
        factory.setCharacters("1234567890模块花多少空间框架卡上的空间按时打卡撒娇的考虑开始");
        cs.setWordFactory(factory);

        cs.setFontFactory(new FontFactory() {
            @Override
            public Font getFont(int i) {
                return new Font("微软雅黑",Font.ITALIC,24);
            }
        });



        FileOutputStream outputStream = new FileOutputStream("D:/captcha.png");
        EncoderHelper.getChallangeAndWriteImage(cs,"png",outputStream);
        outputStream.flush();
        outputStream.close();

    }
}
