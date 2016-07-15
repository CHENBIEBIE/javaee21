package com.kaishengit.web.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/pay")
public class PayServlet extends HttpServlet{

    private Logger logger= LoggerFactory.getLogger("PayServlet.class");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String token = UUID.randomUUID().toString();

        HttpSession session = req.getSession();

        session.setAttribute("token",token);

        req.setAttribute("token",token);

        req.getRequestDispatcher("/WEB-INF/views/pay.jsp").forward(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String token =req.getParameter("token");

        HttpSession session=req.getSession();

        String sessiontoken = (String) session.getAttribute("token");

        if(token != null && token.equals(sessiontoken)){

            session.removeAttribute("token");

            String money = req.getParameter("money");

            logger.info("成功扣款{}元",money);

            req.getRequestDispatcher("WEB-INF/views/paysuc.jsp").forward(req,resp);

        }else {
            req.getRequestDispatcher("WEB-INF/views/payerror.jsp").forward(req,resp);
        }








    }
}
