package com.kaishengit.web.dao;

import com.kaishengit.web.entity.Document;
import com.kaishengit.web.utli.DbHelp;
import org.apache.commons.dbutils.handlers.BeanHandler;

/**
 * Created by Administrator on 2016/6/16.
 */
public class DocumentDao {

    public void save(Document document){

        String sql = "INSERT INTO t_document (filename, savename, md5, extname, size, displaysize) value(?,?,?,?,?,?)";
        DbHelp.update(sql,document.getFilename(),document.getSavename(),document.getMd5(),document.getExtname(),document.getSize(),document.getDisplaysize());
    }

    public Document findByMd5(String md5) {

        String sql ="select * from t_document where md5=?";

        return DbHelp.query(sql,new BeanHandler<Document>(Document.class),md5);
    }
}
