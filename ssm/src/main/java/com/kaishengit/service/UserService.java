package com.kaishengit.service;

import com.kaishengit.mapper.RoleMapper;
import com.kaishengit.mapper.UserLogMapper;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.pojo.User;
import com.kaishengit.pojo.UserLog;
import com.kaishengit.util.ShiroUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.joda.time.DateTime;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserService {

    @Inject
    private UserMapper userMapper;

    @Inject
    private UserLogMapper userLogMapper;

    @Inject
    private RoleMapper roleMapper;

    //记录用户日志
    public void saveUserLogin(String ip) {

        UserLog userLog = new UserLog();

        userLog.setLoginip(ip);
        userLog.setLogintime(DateTime.now().toString("yyyy-MM-dd HH-mm"));
        userLog.setUserid(ShiroUtil.getCurrentUserId());

        userLogMapper.save(userLog);
    }

    /**
     * 修改用户密码
     */
    public void changePassword(String password) {

        User user = ShiroUtil.getCurrentUser();
        user.setPassword(DigestUtils.md5Hex(password));

        userMapper.updateUser(user);
    }
}
