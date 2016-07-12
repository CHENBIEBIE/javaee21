package com.kaishengit.mapper;

import com.kaishengit.pojo.Notice;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/12.
 */
public interface NoticeMapper {
    void save(Notice notice);

    List<Notice> findByParam(Map<String, Object> param);

    Long count();


    Notice findById(Integer id);
}
