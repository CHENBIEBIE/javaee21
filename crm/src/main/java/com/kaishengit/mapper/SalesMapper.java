package com.kaishengit.mapper;

import com.kaishengit.pojo.Sales;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/17.
 */
public interface SalesMapper {


    void save(Sales sales);

    List<Sales> findByParam(Map<String, Object> params);

    Long countByParam(Map<String, Object> params);


    Sales findById(Integer id);

    void update(Sales sales);

    void del(Integer id);

    List<Sales> findByCustId(Integer custId);

    Long findStateCount(@Param("start") String start ,@Param("end") String end ,@Param("state") String state);

    Float findStateMoney(@Param("start") String start ,@Param("end") String end ,@Param("state") String state);

    List<Map<String,Object>> countProgress(@Param("start") String start ,@Param("end") String end);

    List<Map<String,Object>> totalUserMoney(@Param("start") String start ,@Param("end") String end);
}
