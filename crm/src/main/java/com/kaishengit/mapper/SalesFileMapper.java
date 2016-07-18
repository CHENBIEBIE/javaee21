package com.kaishengit.mapper;


import com.kaishengit.pojo.SalesFile;

import java.util.List;

public interface SalesFileMapper {
    List<SalesFile> findBySalesId(Integer id);

    void del(List<SalesFile> salesFileList);

    void save(SalesFile salesFile);

    SalesFile findById(Integer id);
}
