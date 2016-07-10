package com.kaishengit.controller;

import com.kaishengit.exception.NotFoundException;
import com.kaishengit.pojo.User;
import com.kaishengit.service.UserService;
import com.kaishengit.util.ShiroUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
@RequestMapping("/user")
public class UserController {
    @Inject
    private UserService userService;

    @RequestMapping(value = "/password",method = RequestMethod.GET)
    public String editPassword(){

        return "setting/password";

    }

    @RequestMapping(value = "/password",method = RequestMethod.POST)
    @ResponseBody
    public String editPassword(String password){

        userService.changePassword(password);
        return "success";

    }




    @RequestMapping(value = "/validate/password",method = RequestMethod.GET)
    @ResponseBody
    public String validateOldPassword(@RequestHeader("x-Requested-with") String xRequestedwith, String oldpassword){

        if ("XMLHttpRequest".equals(xRequestedwith)){

            User user = ShiroUtil.getCurrentUser();//获取登录用户
            if (user.getPassword().equals(DigestUtils.md5Hex(oldpassword))){

                return "true";
            }
            return "false";

        }else {
            throw new NotFoundException();
        }

    }
}
