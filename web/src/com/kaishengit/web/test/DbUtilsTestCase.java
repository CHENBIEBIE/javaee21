package com.kaishengit.web.test;


import com.kaishengit.web.entity.User;
import com.kaishengit.web.utli.ConnectionManager;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DbUtilsTestCase {

    @Test
    public void testSave(){

        QueryRunner queryRunner = new QueryRunner();

        String sql = "insert into t_user(username,password,address) value(?,?,?)";

        Connection connection = ConnectionManager.getConnection();
        try {
            queryRunner.update(connection,sql,"jack","123123","USA");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection(connection);
        }
    }
    @Test
    public void testUpdate(){
        QueryRunner queryRunner=new QueryRunner();
        String sql = "update t_user set username=? where id=?";
        Connection connection = ConnectionManager.getConnection();

        try {
            queryRunner.update(connection,sql,"ll",1);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.closeConnection(connection);
        }
    }
    @Test
    public void testQuerybyId(){
        String sql = "select * from t_user where id =?";

        Connection connection = ConnectionManager.getConnection();

        QueryRunner queryRunner= new QueryRunner();
        try {
            User user=queryRunner.query(connection,sql,new BeanHandler<>(User.class),1);
            System.out.println(user);
            Assert.assertNotNull(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.closeConnection(connection);
        }

    }

    @Test
    public void testQueryAll(){
        String sql = "select * from t_user";

        Connection connection = ConnectionManager.getConnection();

        QueryRunner queryRunner= new QueryRunner();
        try {
            List<User> userList=queryRunner.query(connection,sql,new BeanListHandler<>(User.class));
            Assert.assertEquals(userList.size(),2);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.closeConnection(connection);
        }
    }

    @Test
    public void testQuerybyIdToMap(){
        String sql = "select * from t_user where id =?";

        Connection connection = ConnectionManager.getConnection();

        QueryRunner queryRunner= new QueryRunner();
        try {
            Map<String,Object> result =queryRunner.query(connection,sql,new MapHandler(),1);
            for(Map.Entry<String,Object>entry:result.entrySet()){
                System.out.println(entry.getKey() +"->" +entry.getValue());
            }

            Assert.assertNotNull(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.closeConnection(connection);
        }

    }
    @Test
    public void testQueryAllToMap(){
        String sql = "select * from t_user";

        Connection connection = ConnectionManager.getConnection();

        QueryRunner queryRunner= new QueryRunner();
        try {
            List<Map<String,Object>> resultList=queryRunner.query(connection,sql,new MapListHandler());

            for(int i = 0;i<resultList.size();i++){

                Map<String,Object> result=resultList.get(i);
                for(Map.Entry<String,Object>entry:result.entrySet()){
                    System.out.println(entry.getKey() +"->" +entry.getValue());
                }
                System.out.println("------------------------------------");

            }

            Assert.assertEquals(resultList.size(),2);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.closeConnection(connection);
        }
    }

    @Test
    public void testCount(){
        String sql = "select count(*) from t_user";
        Connection connection = ConnectionManager.getConnection();
        QueryRunner queryrunner = new QueryRunner();
        try {
            Long count=queryrunner.query(connection,sql,new ScalarHandler<Long>());
            Assert.assertEquals(new Long(2),count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.closeConnection(connection);
        }
    }

    @Test
    public void  testQueryAllUsername(){
        String sql = "select username from t_user";
        Connection connection = ConnectionManager.getConnection();
        QueryRunner queryrunner = new QueryRunner();
        try {
            List <String> nameList =queryrunner.query(connection,sql,new ColumnListHandler<String>());
            Assert.assertEquals(2,nameList.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionManager.closeConnection(connection);
        }
    }

}
