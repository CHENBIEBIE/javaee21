package com.kaishengit.mapper;

import com.kaishengit.pojo.Node;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NodeMapper {

    List<Node> findByIds(List<Integer> idList);


    void batchSave(List<Node> nodeList);

    @Select("select *from t_node where id=#{id}")
    Node findById(Integer id);
}
