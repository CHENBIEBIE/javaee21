package com.kaishengit.service;

import com.kaishengit.mapper.NoticeMapper;
import com.kaishengit.pojo.Notice;
import com.kaishengit.util.ShiroUtil;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class NoticeService {

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
}
