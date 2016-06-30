package com.kaishengit.service;

import com.kaishengit.dao.UserDao;

/**
 * Created by Administrator on 2016/6/30.
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void sayHi(){
        System.out.println("say hi...");
        userDao.save();
    }
}
