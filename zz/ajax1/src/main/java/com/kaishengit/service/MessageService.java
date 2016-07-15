package com.kaishengit.service;

import com.kaishengit.dao.MessageDao;
import com.kaishengit.entity.Message;

import java.util.List;

/**
 * Created by Administrator on 2016/6/24.
 */
public class MessageService {

    private MessageDao messageDao = new MessageDao();

    public List<Message> findAll(){

        return messageDao.findAll();
    }

    public List<Message> findMessageById(String maxId) {

        return messageDao.findGtMaxId(maxId);
    }
}
