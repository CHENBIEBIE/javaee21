package com.kaishengit.web.service;

import com.kaishengit.web.dao.DocumentDao;
import com.kaishengit.web.entity.Document;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.UUID;

/**
 * Created by Administrator on 2016/6/16.
 */
public class DocumentService {

    private DocumentDao documentDao = new DocumentDao();

    public void updateFile(String fileName,Long size,InputStream inputStream) throws IOException{
        //为了支持inputstream的reset方法，将inputstream转换为ByteArrayInputStream
        //解决了图片保存读取不了的问题
        ByteArrayInputStream byteArrayInputStream =
                new ByteArrayInputStream(IOUtils.toByteArray(inputStream));


        String md5 = DigestUtils.md5Hex(inputStream);

        Document document =documentDao.findByMd5(md5);

        if (document==null){
            String saveFile = saveFile(fileName,inputStream);

            document =new Document();
            document.setFilename(fileName);
            document.setSavename(saveFile);
            document.setExtname(fileName.substring(fileName.indexOf(".")));
            document.setMd5(md5);
            document.setSize(size);
            document.setDisplaysize(FileUtils.byteCountToDisplaySize(size));

            documentDao.save(document);
        }

    }

    private String saveFile(String fileName, InputStream inputStream) throws IOException {

        File dir = new File("D:/update");
        if (!dir.exists()){
            dir.mkdirs();
        }


        //截取到文件后缀名
        String extName = fileName.substring(fileName.indexOf("."));
        //生成唯一的名字
        String uuid = UUID.randomUUID().toString();

        fileName = uuid + extName;



        FileOutputStream output = new FileOutputStream(new File(dir,fileName));

        IOUtils.copy(inputStream,output);
        output.flush();
        output.close();
        inputStream.close();


        return fileName;
    }


}
