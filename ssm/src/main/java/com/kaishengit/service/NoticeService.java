package com.kaishengit.service;

import com.kaishengit.mapper.NoticeMapper;
import com.kaishengit.pojo.Notice;
import com.kaishengit.util.ShiroUtil;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Named
public class NoticeService {

    @Value("${imagePath}")
    private String imageSavePath;

    @Inject
    private NoticeMapper noticeMapper;

    /**
     * 保存新的公告
     * @param notice
     */
    public void saveNotice(Notice notice) {

        notice.setUserid(ShiroUtil.getCurrentUserId());
        notice.setRealname(ShiroUtil.getCurrentRealname());
        noticeMapper.save(notice);

    }

    /**
     * 根据条件查询公告内容，集合
     * @param param
     * @return
     */
    public List<Notice> findByParam(Map<String, Object> param) {
        return noticeMapper.findByParam(param);
    }

    /**
     * 获取公告总数量
     * @return
     */
    public Long count() {

        return noticeMapper.count();
    }


    /**
     * 根据主键查找公告对象，id
     * @param id
     * @return
     */

    public Notice findNoticeById(Integer id) {
        return noticeMapper.findById(id);
    }

    /**
     * 在公告页面上传图片
     * @param inputStream
     */
    public String saveImage(InputStream inputStream,String fileName) throws IOException {


        String extName = fileName.substring(fileName.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString();/*+extName*/

        FileOutputStream outputStream = new FileOutputStream(new File(imageSavePath,newFileName));

        IOUtils.copy(inputStream,outputStream);

        outputStream.flush();
        outputStream.close();
        inputStream.close();
        return "/preview/"+newFileName;

    }
}
