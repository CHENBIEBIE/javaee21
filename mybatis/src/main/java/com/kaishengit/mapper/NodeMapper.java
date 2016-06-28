package com.kaishengit.mapper;

import com.kaishengit.pojo.Node;

import java.util.List;

/**
 * Created by Administrator on 2016/6/28.
 */
public interface NodeMapper {

    List<Node> findByIds(List<Integer> idList);


    void batchSave(List<Node> nodeList);
}
