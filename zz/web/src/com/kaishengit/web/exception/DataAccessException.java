package com.kaishengit.web.exception;

/**
 * Created by Administrator on 2016/6/15.
 * 自定义异常处理
 */
public class DataAccessException extends RuntimeException{

    public DataAccessException(){}

    public DataAccessException(String msg){
        super(msg);
    }

    public DataAccessException(String msg,Exception ex){
        super(msg,ex);
    }
}
