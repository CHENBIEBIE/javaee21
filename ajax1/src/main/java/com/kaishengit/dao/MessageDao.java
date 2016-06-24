package com.kaishengit.dao;

import com.kaishengit.entity.Message;
import com.kaishengit.uitl.DbHelp;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

/**
 * Created by Administrator on 2016/6/24.
 */
public class MessageDao {

    public List<Message> findAll(){

        String sql = "select * from t_message order by id desc";

        return DbHelp.query(sql,new BeanListHandler<Message>(Message.class));
    }

}
