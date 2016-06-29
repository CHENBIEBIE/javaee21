package com.kaishengit.mapper;

import com.kaishengit.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/28.
 */
public interface UserMapper {

    List<User> findByPage(@Param("start") int start,@Param("size") int pageSize);

    List<User> findByQueryParam(Map<String,Object> queryParam);

    //User findByParams(@Param("username") String username,@Param("password") String password);

    User findByParams(String username,Object password);

    User findByMap(Map<String, Object>param);

    User findById(Integer id);

    void save(User user);

    void update(User user);

    void del(Integer id);

    List<User> findAll();







}
