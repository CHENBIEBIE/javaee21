package com.kaishengit.mapper;

import com.kaishengit.pojo.Sales;
import com.kaishengit.pojo.SalesLog;

import java.util.List;

/**
 * Created by Administrator on 2016/7/18.
 */
public interface SalesLogMapper {


    List<SalesLog> findBySalesId(Integer id);

    void save(SalesLog salesLog);


    void del(List<SalesLog> salesLogList);
}
