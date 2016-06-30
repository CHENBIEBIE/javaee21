package com.kaishengit.service;

import com.kaishengit.dao.UserDao;

/**
 * Created by Administrator on 2016/6/30.
 */
public class UserService {

    private UserDao userDao;

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/




    /*
    * 构造方法这种依赖是耦合程度最高的的依赖
    * 如果不给userDao传值UserService就不能使用
    * 少用
    * */
    public UserService (UserDao userDao){

        this.userDao = userDao;

    }

    public void sayHi(){

        userDao.save();
    }
}
