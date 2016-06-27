package com.kaishengit.test;

import com.kaishengit.dao.MessageDao;
import com.kaishengit.entity.Message;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/6/27.
 */
public class MessageTestCase {

    private MessageDao messageDao = new MessageDao();

    @Test
    public void testFindById(){

        Message message = messageDao.findById(1);
        message=messageDao.findById(1);
        message=messageDao.findById(1);
        message=messageDao.findById(1);
        message=messageDao.findById(1);

        Assert.assertNotNull(message);
    }
    @Test
    public void testOne(){
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("os.name"));
    }
    @Test
    public void testFindAll(){
        List<Message> messageList = messageDao.findAll();//数据库
        messageList = messageDao.findAll();//cache

        Message message = new Message();

        message.setAuthor("mike");
        message.setMessage("Hi");
        messageDao.save(message);//insert 删除缓存


        messageList =messageDao.findAll();//数据库
        messageList = messageDao.findAll();//cache
        Assert.assertEquals(18,messageList.size());
    }


    @Test
    public void testEhCache(){
        //读取配置文件
        CacheManager cacheManager = new CacheManager();
        //这个myCache就是配置文件cache name的值
        Ehcache ehcache =  cacheManager.getEhcache("myCache");

        Element element = new Element("user:1","java");

        ehcache.put(element);

        //删除cache中的值
        ehcache.remove("user:1");

        //从缓存中取值
        Element outElemen = ehcache.get("user:1");

        String value =null;
        if (outElemen==null){

            //这一步才拿到java的值
            value = (String) outElemen.getObjectValue();

            System.out.println(value);

        }
        Assert.assertNotNull(value);

    }
}
