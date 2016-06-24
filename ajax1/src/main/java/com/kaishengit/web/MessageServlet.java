package com.kaishengit.web;

import com.kaishengit.entity.Message;
import com.kaishengit.service.MessageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/6/24.
 */
@WebServlet("/message")
public class MessageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //当访问mes是通过传参的方式传过来

        List<Message> messageList = new MessageService().findAll();
        req.setAttribute("messageList",messageList);
        int maxId = 0;
        if (!messageList.isEmpty()){
            maxId = messageList.get(0).getId();
        }
        req.setAttribute("maxId",maxId);

        req.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(req,resp);
    }
}
