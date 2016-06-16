package com.kaishengit.web.test;


import com.kaishengit.web.dao.UserDao;
import com.kaishengit.web.entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

//单元测试，测试数据库的增删改查是否正常
public class UserDaoTestCase {

    private UserDao userDao = new UserDao();

    @Test
    public void testSave(){


        //测试不出异常时表示通过，数据库添加成功
        User user = new User( "李四","100","USA");
        userDao.save(user);

    }

    @Test
    public void testDel(){
        userDao.del(5);
    }
    @Test
    public void testfindById(){
        User user=userDao.findById(3);

        Assert.assertNotNull(user);
        System.out.print(user);
    }

    @Test
    public void testfindAll(){
        List<User> userList =userDao.findAll();
        Assert.assertEquals(userList.size(),4);
    }
}
