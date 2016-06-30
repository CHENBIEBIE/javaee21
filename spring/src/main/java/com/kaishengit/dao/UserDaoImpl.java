package com.kaishengit.dao;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/30.
 */
public class UserDaoImpl implements UserDao{


    @Override
    public Integer save() {
        System.out.println("userDao.....save");
        /*if (1==1){
            throw new RuntimeException("出大事了。。");
        }*/
        return 1000;
    }
}
