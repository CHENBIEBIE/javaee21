package com.kaishengit.test;

import com.kaishengit.pojo.User;
import com.kaishengit.utli.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MyBatisTestCase {

    private Logger logger = LoggerFactory.getLogger(MyBatisTestCase.class);


    @Test
    public void testLoadXml() {

        try {

            Reader reader = Resources.getResourceAsReader("mybatis.xml");

            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession = sessionFactory.openSession();

            //CRUD
            //str: namespace+id
            User user = sqlSession.selectOne("com.kaishengit.mapper.UserMapper.findById",4);

            logger.debug("{}",user);




            sqlSession.close();

            Assert.assertNotNull(user);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testSave() {

        try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession = sessionFactory.openSession();

            User user = new User();
            user.setUsername("kkkk");
            user.setPassword("123123");
            user.setState("正常");


            sqlSession.insert("com.kaishengit.mapper.UserMapper.save",user);

            sqlSession.commit(); //提交事务
            sqlSession.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testUpdate() {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        User user = sqlSession.selectOne("com.kaishengit.mapper.UserMapper.findById",3);
        user.setLoginip("6.6.6.6");
        user.setLogintime("2016-08-08 11:11:11");

        sqlSession.update("com.kaishengit.mapper.UserMapper.update",user);

        sqlSession.commit();
        sqlSession.close();


    }

    @Test
    public void testDel() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        sqlSession.delete("com.kaishengit.mapper.UserMapper.del",7);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testFindAll() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        List<User> userList = sqlSession.selectList("com.kaishengit.mapper.UserMapper.findAll");
        for(User user : userList) {
            logger.debug("{}",user);
        }
        sqlSession.close();

        Assert.assertEquals(5,userList.size());
    }
}