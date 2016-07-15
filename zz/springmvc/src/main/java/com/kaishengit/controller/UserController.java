package com.kaishengit.controller;

import com.kaishengit.pojo.User;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
@RequestMapping("/users")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model,
                       @RequestParam(required = false ,defaultValue = "false") String vip,
                       Integer age,
                       @RequestHeader(value = "User-Agent",required = false,defaultValue = "") String UserAgent,
                       @CookieValue(value = "JSESSIONID",required = false,defaultValue = "") String sessionId){

        model.addAttribute("userName","tom");
        logger.debug("User-Agent:{}",UserAgent);
        logger.debug(":CookieId{}",sessionId);

        logger.debug("vip:{} age:{}",vip,age);
        return "users/list";
    }

    @RequestMapping(value = "/{id:\\d+}",method = RequestMethod.GET)
    public ModelAndView showUser(@PathVariable("id") Integer userId){

        logger.debug("Id:{}",userId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users/show");
        modelAndView.addObject("userId",userId);
        return modelAndView;

    }



    @RequestMapping(value = "/{userId:\\d+}/photo/catalog/{catalogId:\\d+}",method = RequestMethod.GET)
    public String showUserPhoto(@PathVariable Integer userId,@PathVariable Integer catalogId){

        logger.debug("userId : {} catalogId :{}",userId,catalogId);
        return "users/photos";
    }


    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String newUser(){

        return "users/new";
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String userSave(User user,String comment){
        logger.debug("username:{} address:{} age:{} comment:{}",user.getUsername(),user.getAddress(),user.getAge(),comment);
        return "redirect:/users";
    }

    @RequestMapping(value = "/{id:\\d+}/del",method = RequestMethod.GET)
    public String del(@PathVariable Integer id){

        logger.debug("del Object {}",id);
        return "redirect:/users";
    }


    //----------Ajax------


    @RequestMapping(value = "/checkuser.json",
                    method = RequestMethod.GET,
                    produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String checkUser(@PathVariable Integer id){
        logger.debug("Id:{}",id);

        return "success";
    }


    @RequestMapping(value = "/{id}.json",
                    method = RequestMethod.GET,

                    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public User showUserJson(){

        User user = new User();

        user.setUsername("李雷");
        user.setAddress("USA");
       user.setAge(99);
        return user;
    }



    @RequestMapping(value = "/native")
    public String nativeHttpServlet(HttpServletRequest request,
                                    HttpServletResponse response,
                                    HttpSession session){
        ServletContext context= session.getServletContext();
        session.setAttribute("curr_user","tom");
        return "/home";
    }




    //-------文件的上传------


    @RequestMapping(value = "/avatar/update",method = RequestMethod.GET)
    public String updatedAavatr(){

        return "users/upload";
    }


    @RequestMapping(value = "/avatar/update",method = RequestMethod.POST)
    public String updatedAavatr(String photoname, MultipartFile file){


        logger.debug("photoname:{}",photoname);
        logger.debug("File Type:{}",file.getContentType());
        logger.debug("file size:{}",file.getSize());
        logger.debug("file isEmpty:{}",file.isEmpty());
        logger.debug("file Name",file.getOriginalFilename());


        try {
            IOUtils.copy(file.getInputStream(),new FileOutputStream("/D:"+file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/users";
    }
}
