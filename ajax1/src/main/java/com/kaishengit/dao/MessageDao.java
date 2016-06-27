package com.kaishengit.dao;

import com.kaishengit.entity.Message;
import com.kaishengit.uitl.DbHelp;
import com.kaishengit.uitl.cache.EhCacheUitl;
import com.kaishengit.uitl.cache.SimpleCache;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Administrator on 2016/6/24.
 */
public class MessageDao {
    Logger logger = LoggerFactory.getLogger(Message.class);

    public Message findById(Integer id){
        //加缓存
        Message message = (Message) EhCacheUitl.get("message:" + id);
        if (message==null){


            String sql = "select * from t_message where id = ?";

            message = DbHelp.query(sql,new BeanHandler<>(Message.class),id);

            EhCacheUitl.set("message:"+id,message);
        }else {
            logger.debug("load message from cache");
        }

        return message;
    }


    public List<Message> findAll(){

        List<Message> messageList = (List<Message>) EhCacheUitl.get("messageList");

        if (messageList==null){
            String sql = "select * from t_message order by id desc";

            messageList= DbHelp.query(sql,new BeanListHandler<>(Message.class));
            EhCacheUitl.set("messageList",messageList);
        }
        return messageList;
    }

    public void save(Message message) {
        String sql = "insert into t_message(message,author) values(?,?)";
        DbHelp.update(sql,message.getMessage(),message.getAuthor());
        EhCacheUitl.remove("messageList");
    }

    public List<Message> findGtMaxId(String maxId) {

        String sql = "select * from t_message where id > ? order by id desc";
        return DbHelp.query(sql,new BeanListHandler<>(Message.class),maxId);


    }
}
