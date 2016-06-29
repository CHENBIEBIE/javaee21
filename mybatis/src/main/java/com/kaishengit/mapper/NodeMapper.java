package com.kaishengit.mapper;

import com.kaishengit.pojo.Node;

import java.util.List;

public interface NodeMapper {

    List<Node> findByIds(List<Integer> idList);


    void batchSave(List<Node> nodeList);

    Node findById(Integer id);
}
