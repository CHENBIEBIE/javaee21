package com.kaishengit.mapper;

import com.kaishengit.pojo.Customer;
import com.kaishengit.pojo.Sales;

import javax.activation.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/17.
 */
public interface SalesMapper {


    void save(Sales sales);

    List<Sales> findByParam(Map<String, Object> params);

    Long countByParam(Map<String, Object> params);
}
