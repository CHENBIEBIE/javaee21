package com.kaishengit.pojo;

/**
 * Created by Administrator on 2016/6/28.
 */
public class Node {

    private Integer id;

    private String nodename;

    public Node() {
    }

    public Node(String nodename) {
        this.nodename = nodename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", nodename='" + nodename + '\'' +
                '}';
    }
}
