package com.kaishengit.mapper;

import com.kaishengit.pojo.User;

/**
 * Created by Administrator on 2016/7/8.
 */
public interface UserMapper {

    User findByUsername(String username);

    void updateUser(User user);
}