package com.kaishengit.web.service;
import com.kaishengit.web.dao.UserDao;
import com.kaishengit.web.entity.User;
import com.kaishengit.web.utli.EmailUtil;
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

        User user = userDao.findByUserName(username);

        if (user!=null&& user.getPassword().equals(password)){
            logger.debug("{} 登录系统",username);

            EmailUtil.sendHtmlMail(user.getAddress(),"账号登录提示","你的账号"+username+"在?登陆了");
        }
        return null;
    }
}
