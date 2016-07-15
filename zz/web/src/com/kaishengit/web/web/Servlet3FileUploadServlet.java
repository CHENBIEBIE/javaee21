package com.kaishengit.web.web;

import com.kaishengit.web.service.DocumentService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.UUID;

/**
 * Created by Administrator on 2016/6/16.
 */
@WebServlet("/upload")
@MultipartConfig
public class Servlet3FileUploadServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger(Servlet3FileUploadServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/upload3.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        String fileDesc = req.getParameter("fileDesc");
        logger.debug("文件描述为：{}",fileDesc);

        Part part = req.getPart("doc");

        InputStream input = part.getInputStream();
        DocumentService documentService = new DocumentService();

        documentService.updateFile(getFileName(part),part.getSize(),input);






        /*String contentType = part.getContentType();
        //MIME头
        logger.debug("文件的ContentType:{}",contentType);

        long size =part.getSize();
        logger.debug("文件的大小size:{}",size);

        String headerValue = part.getHeader("Content-Disposition");

        String fileName = getFileName(part);
        logger.debug("文件的原始名字:{}",fileName);

        saveFile(part);*/


    }

   /* private void saveFile(Part part) throws IOException{

        File dir = new File("D:/update");
        if (!dir.exists()){
            dir.mkdirs();
        }

        String fileName = getFileName(part);
        //截取到文件后缀名
        String extName = fileName.substring(fileName.indexOf("."));
        //生成唯一的名字
        String uuid = UUID.randomUUID().toString();

        fileName = uuid + extName;

        InputStream input = part.getInputStream();//保存文件到服务器

        FileOutputStream output = new FileOutputStream(new File(dir,fileName));

        IOUtils.copy(input,output);
        output.flush();
        output.close();
        input.close();

        *//*InputStream input = part.getInputStream();//保存文件到服务器

        FileOutputStream output = new FileOutputStream(new File(dir,getFileName(part)));

        //输入输出流
        BufferedInputStream bufferInput = new BufferedInputStream(input);
        BufferedOutputStream bufferOutput = new BufferedOutputStream(output);

        //缓冲
        byte[] buffer = new byte[1024];

        int len = -1;
        while ((len=bufferInput.read(buffer))!=-1){

            bufferOutput.write(buffer,0,len);
        }
        bufferOutput.flush();
        bufferOutput.close();
        bufferInput.close();*//*

    }*/

    private String getFileName(Part part){

        String headerValue = part.getHeader("Content-Disposition");

        headerValue = headerValue.substring(headerValue.indexOf("filename=\""));
        headerValue = headerValue.substring(headerValue.indexOf("\"")+1,headerValue.length()-1);

        return headerValue;
    }
}
