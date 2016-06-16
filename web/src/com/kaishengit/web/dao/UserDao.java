package com.kaishengit.web.dao;

import com.kaishengit.web.entity.User;


import com.kaishengit.web.utli.DbHelp;


import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import java.util.List;

//数据库的增删改查

public class UserDao {

    public void save(User user){
        String sql ="insert into t_user(username,password,address) value(?,?,?)";

        DbHelp.update(sql,user.getUsername(),user.getPassword(),user.getAddress());
    }

    public void del(Integer id){

        String sql = "delete from t_user where id=?";
        DbHelp.update(sql,id);
    }

    public User findById(Integer id){
        String sql = "select * from t_user where id=?";
        return DbHelp.query(sql,new BeanHandler<>(User.class),id);

    }

    public List<User> findAll(){
        String sql = "select * from t_user";
        return DbHelp.query(sql,new BeanListHandler<>(User.class));
    }

}
