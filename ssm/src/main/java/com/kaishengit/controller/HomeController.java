package com.kaishengit.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String home(){

        return "home";

    }

    /*
    * 去登陆页面
    * */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String login(String username, String password, RedirectAttributes redirectAttributes){

        //结收username，password
        Subject subject = SecurityUtils.getSubject();

        if (subject.isAuthenticated()){
            //当前用户登录时退出当前账号
            subject.logout();

        }
        try {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,password);
            subject.login(usernamePasswordToken);
            return "redirect:/home";
        }catch (AuthenticationException e){
            redirectAttributes.addFlashAttribute("message","账号或密码错误");

            return "redirect:/";
        }


    }
}
