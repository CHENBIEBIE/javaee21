package com.kaishengit.util;

import com.kaishengit.pojo.User;
import org.apache.shiro.SecurityUtils;

/**
 * Created by Administrator on 2016/7/8.
 */
public class ShiroUtil {

    public static User getCurrentUser(){

        return (User) SecurityUtils.getSubject().getPrincipal();
    }

    public static Integer getCurrentUserId(){
        return getCurrentUser().getId();
    }

    public static String getCurrentUserName(){
        return getCurrentUser().getUsername();
    }

    public static String getCurrentRealname() {

        return getCurrentUser().getRealname();
    }

    public static boolean isAdmin() {
        return getCurrentUser().getRole().getRolename().equals("管理员");
    }

    public static boolean isEmployee() {

        return getCurrentUser().getRole().getRolename().equals("员工");
    }

    public static boolean isManager() {
        return getCurrentUser().getRole().getRolename().equals("经理");
    }
}
