package com.kaishengit.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/6/20.
 */
@WebServlet("ajax")
public class CheckUserNameServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger(CheckUserNameServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        resp.addHeader("pragma","no-cache");
        resp.addHeader("cache-control","no-cache");
        resp.addHeader("expires","0");

        String username = req.getParameter("username");
        username = new String(username.getBytes("ISO8859-1"),"UTF-8");
        logger.debug("username:{}"+username);

        PrintWriter out =resp.getWriter();
        if ("tom".equals(username)){
            out.print("no");
        }else {
            out.print("yes");
        }
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("一二三四一二三四");
    }
}
