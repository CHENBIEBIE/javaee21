package com.kaishengit.service;

import com.kaishengit.mapper.RoleMapper;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.pojo.Role;
import com.kaishengit.pojo.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ShiroRealm extends AuthorizingRealm {

    @Inject
    private UserMapper userMapper;
    @Inject
    private RoleMapper roleMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //拿到当前登录的用户
        User user = (User) principalCollection.getPrimaryPrincipal();
        if (user != null){

            //拿到角色id根据id查权限
            Integer roleId = user.getRoleid();

            //将用户的角色名赋值给info
            Role role =roleMapper.findById(roleId);
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //一个用户一个角色用addRole多个就用，addRoles
            info.addRole(role.getRolename());
            return info;
        }


        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        String username = token.getUsername();//获取表单中的账号

        User user = userMapper.findByUsername(username);//根据账号查找对应的用户

        if (user != null){

            //员工离职或者禁用账户
            if (!user.getEnable()){

                throw new LockedAccountException("账号已被禁用");
            }

            //根据密码验证
            return new SimpleAuthenticationInfo(user,user.getPassword(),getName());

        }else {
            throw new UnknownAccountException("账号或密码错误");
        }

    }
}