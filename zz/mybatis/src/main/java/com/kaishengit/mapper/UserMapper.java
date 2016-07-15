package com.kaishengit.mapper;

import com.kaishengit.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/28.
 */
public interface UserMapper {

    @Select("select * from t_user  limit ${start},${size}")
    List<User> findByPage(@Param("start") int start,@Param("size") int pageSize);

    List<User> findByQueryParam(Map<String,Object> queryParam);

    //User findByParams(@Param("username") String username,@Param("password") String password);

    User findByParams(String username,Object password);

    User findByMap(Map<String, Object>param);

    @Select("select * from t_user where id=#{id}")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password"),
            @Result(column = "avatar",property = "avatar"),
            @Result(column = "createtime",property = "createtime"),
            @Result(column = "loginip",property = "loginip"),
            @Result(column = "logintime",property = "logintime"),
            @Result(column = "state",property = "state"),
            @Result(property = "tagList",javaType = List.class,column = "id",many = @Many(
                    select = "com.kaishengit.mapper.TagMapper.findByUserId"
            ))

    })
    User findById(Integer id);

    @Insert("INSERT INTO t_user(username, password, email, avatar, createtime, loginip, logintime, state)\n" +
    "VALUES (#{username},#{password},#{email},#{avatar},#{createtime},#{loginip},#{logintime},#{state})")
    void save(User user);

    @Update("UPDATE t_user SET password = #{password},email = #{email},avatar=#{avatar},\n" +
    "loginip=#{loginip},logintime=#{logintime},state=#{state}\n" +
     "where id = #{id}")
    void update(User user);

    @Delete("DELETE FROM t_user WHERE id = #{id}")
    void del(Integer id);

    List<User> findAll();







}
