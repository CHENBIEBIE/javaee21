package com.kaishengit.test;

import com.google.common.collect.Maps;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.pojo.Tag;
import com.kaishengit.pojo.User;
import com.kaishengit.utli.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Map;


public class MyBatisInterFaceTestCase {
    private Logger logger = LoggerFactory.getLogger(MyBatisInterFaceTestCase.class);

    @Test
    public void testFindByPage(){


        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

        List<User> userList = userMapper.findByPage(0,2);

        for (User user:userList){
            logger.debug("{}",user);
        }

        sqlSession.close();

    }
    @Test
    public void testFindByQueryParam(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

        Map<String,Object> queryParam = Maps.newHashMap();

        //queryParam.put("username","jack");
        //queryParam.put("password","12323");
        //queryParam.put("email","jack@qq.com");

        //三个条件不存在时运行异常是写方法时User对象没放在List集合中

        userMapper.findByQueryParam(queryParam);



        sqlSession.close();

    }
    @Test
    public void testFindByParams(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findByParams("Rose","123123");

        logger.debug("{}",user);
        Assert.assertNotNull(user);
    }
    @Test
    public void testFindByMap(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

        Map<String,Object> param = Maps.newHashMap();
        param.put("username","jack");
        param.put("password","2313");

        User user = userMapper.findByMap(param);
        logger.debug("{}",user);

        sqlSession.close();
    }

    @Test
    public void testFindById(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findById(13);

        logger.debug("{}",user);

        List<Tag> tagList = user.getTagList();
        for (Tag tag : tagList){
            logger.debug("{}",tag);
        }

        sqlSession.close();


    }

    @Test
    public void testSave(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setUsername("小mimi");
        user.setPassword("123123");
        user.setState("正常");

        userMapper.save(user);

        logger.debug("userId:{}",user.getId());

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findById(10);

        user.setEmail("com.kishengit.020.com");

        userMapper.update(user);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testDel(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

        userMapper.del(18);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindAll(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = userMapper.findAll();

        for (User user:userList){
            logger.debug("{}",user);
        }
        sqlSession.close();
    }


}
