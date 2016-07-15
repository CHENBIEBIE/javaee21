package com.kaishengit.dao;

import com.kaishengit.entity.Movie;
import com.kaishengit.util.DbHelp;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.util.List;

/**
 * Created by Administrator on 2016/6/18.
 */
public class MovieDao {

    public List<Movie> findAll(){

        String sql = "select *from movie";

        return DbHelp.query(sql,new BeanListHandler<>(Movie.class));
    }

    public List<Movie> findByPage(int star,int size){
        String sql ="select * from movie limit ?,?";
        return DbHelp.query(sql,new BeanListHandler<>(Movie.class),star,size);

    }

    public int count(){
        String sql ="select count(*) from movie";
        return DbHelp.query(sql,new ScalarHandler<Long>()).intValue();
    }
}
