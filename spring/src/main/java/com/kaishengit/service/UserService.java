package com.kaishengit.service;

import com.kaishengit.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Named
public class UserService {

    @Autowired
    private UserDao userDao;

   /* @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/




    /*
    * 构造方法这种依赖是耦合程度最高的的依赖
    * 如果不给userDao传值UserService就不能使用
    * 少用
    * */
    /*public UserService (UserDao userDao){

        this.userDao = userDao;

    }*/

    public void sayHi(){

        userDao.save();
    }
}
