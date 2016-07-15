package com.kaishengit.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);


    @RequestMapping("/home")
    public String home(){

        logger.debug("Hello,SpringMvc");
        return "home";

    }
}
