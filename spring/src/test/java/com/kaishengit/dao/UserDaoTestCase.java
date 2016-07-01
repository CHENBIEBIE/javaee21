package com.kaishengit.dao;

import com.kaishengit.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class UserDaoTestCase {

    //把想要测试的对象注入进来
    @Inject
    private UserDao userDao;

    @Test
    public void testSave(){

        User user = new User();

        user.setUsername("Spring2");
        user.setPassword("110110");
        user.setAddress("中国");

        userDao.save(user);
    }

    @Test
    public void testDel(){
        
    }

    @Test
    public void testUpdate(){
        User user = userDao.findById(9);
        user.setUsername("LIU");

        userDao.update(user);
    }

    @Test
    public void testFindById(){
        User user = userDao.findById(7);
        Assert.assertNotNull(user);
        System.out.println(user);
    }

    @Test
    public void testFindByName(){
        User user = userDao.findByUserName("jack");
        Assert.assertNotNull(user);
        System.out.println(user);
    }

    @Test
    public void testFindAll(){
        List<User> userList = userDao.findAll();
        for (User user:userList){
            System.out.println(user);
        }
    }
}
