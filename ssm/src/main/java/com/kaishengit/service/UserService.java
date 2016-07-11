package com.kaishengit.service;

import com.google.common.collect.Maps;
import com.kaishengit.mapper.RoleMapper;
import com.kaishengit.mapper.UserLogMapper;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.pojo.Role;
import com.kaishengit.pojo.User;
import com.kaishengit.pojo.UserLog;
import com.kaishengit.util.ShiroUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.joda.time.DateTime;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

@Named
public class UserService {

    @Inject
    private UserMapper userMapper;

    @Inject
    private UserLogMapper userLogMapper;

    @Inject
    private RoleMapper roleMapper;

    /**
     * 记录用户日志
     * @param ip
     */
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

    /*
    获取当前用户的日志
    * */

    public List<UserLog> findCurrentUserLog(String start, String length) {
        Map<String,Object> param = Maps.newHashMap();
        param.put("userId",ShiroUtil.getCurrentUserId());
        param.put("start",start);
        param.put("length",length);
        return userLogMapper.findByParam(param);
    }

    /**
     * 获取当前用户的日志数量
     * @return
     */
    public Long findCurrentUserLogCount() {

        Map<String,Object> param = Maps.newHashMap();
        param.put("userId",ShiroUtil.getCurrentUserId());
        return userLogMapper.countByParam(param);
    }

    /**
     *  根据查询参数获取用户列表
     */

    public List<User> findUserListByParam(Map<String, Object> params) {
        return userMapper.findByParam(params);
    }

    /**
     获取用户总数
     */
    public Long findUserCount() {
        return userMapper.count();
    }

    /**
     获取过滤后的人数，
     当前人数
     */
    public Long findUserCountByParam(Map<String, Object> params) {
        return userMapper.countByParam(params);
    }

    /**
     查找角色
     */
    public List<Role> findAllRole() {
        return roleMapper.findAll();
    }

    /**
     * 添加新用户
     * @param user
     */
    @Transactional
    public void saveUser(User user) {

        user.setEnable(true);
        user.setPassword(DigestUtils.md5Hex(user.getPassword()));

        userMapper.save(user);



    }

    /**
     * 根据用户名查找用户（注册时）
     * @param username
     * @return
     */
    public User findUserByUserName(String username) {
        return userMapper.findByUsername(username);
    }

    /**
     *
     * @param id 用户的id
     */
    public void resetUserPassword(Integer id) {

        User user = userMapper.findById(id);
        if (user != null){
            user.setPassword(DigestUtils.md5Hex("000000"));
            userMapper.updateUser(user);
        }

    }
}