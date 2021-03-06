package com.kaishengit.web.web;

import com.kaishengit.web.entity.User;
import com.kaishengit.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{


    //日志
    private Logger logger = LoggerFactory.getLogger(LoginServlet.class);

    //把验证码镶嵌到网页中
    //创建一个登陆的视图让信息转发过去


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.判断验证码是否正确
        //1.1获取表单中的值
        String captcha =req.getParameter("captcha");
        //1.2获取session中的值
        String sessionCaptcha = (String) req.getSession().getAttribute("captcha");

        if(captcha !=null && captcha.equalsIgnoreCase(sessionCaptcha)){
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            UserService userService = new UserService();
            User user = userService.login(username,password);


            //logger.debug("{}登陆成功",username);


        }else{
            //验证码错误
            //logger.warn("验证码错误");
            resp.sendRedirect("/login?code=1001");

        }
    }
}
