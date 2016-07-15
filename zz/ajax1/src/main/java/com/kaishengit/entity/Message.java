package com.kaishengit.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/24.
 */
public class Message implements Serializable{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String message;

    private String author;
}
