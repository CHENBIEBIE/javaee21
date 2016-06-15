package com.kaishengit.web.service;
import com.kaishengit.web.dao.UserDao;
import com.kaishengit.web.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {

    Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserDao userDao = new UserDao();
    /**
     * 用户登录
     * @param username 账户
     * @param password 密码
     * @return 登陆成功返回User对象，登陆失败返回null
     */
    public User login(String username,String password){
        return null;
    }
}
