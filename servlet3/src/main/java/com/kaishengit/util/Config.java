package com.kaishengit.util;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2016/6/15.
 */

/**
 * 读取config.prop..文件
 * @author CHENBIEBIE
 */
public class Config {
    private static Properties properties = new Properties();
    static {

        try {
            properties.load(Config.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key){

        return properties.getProperty(key);
    }

    public static String get(String key,String defaultValue){
        return properties.getProperty(key, defaultValue);
    }
}
