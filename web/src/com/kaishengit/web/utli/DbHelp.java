package com.kaishengit.web.utli;

import org.apache.commons.dbutils.QueryRunner;

import org.apache.commons.dbutils.ResultSetHandler;
import org.omg.CORBA.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

import java.sql.SQLException;

/**
 * Created by Administrator on 2016/6/13.
 */
public class DbHelp {
    private static Logger logger = LoggerFactory.getLogger(DbHelp.class);

    public static void update(String spl, Object... params){
        QueryRunner queryRunner =new QueryRunner((DataSource) ConnectionManager.getConnection());

        try {
            queryRunner.update(spl,params);
            logger.debug("SQL: {}",spl);
        } catch (SQLException e) {
            logger.error("执行{}异常",spl);
           e.getErrorCode();
        }

    }



}
