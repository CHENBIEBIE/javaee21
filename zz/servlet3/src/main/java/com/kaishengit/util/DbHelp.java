package com.kaishengit.util;

import com.kaishengit.exception.DataAccessException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.junit.Assert;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/6/13.
 * 代码繁杂制作成方法代用
 */
public class DbHelp {

    public static void update(String sql,Object...params){

        QueryRunner queryRunner = new QueryRunner();

        Connection connection=ConnectionManager.getConnection();

        try {
            queryRunner.update(connection,sql,params);
        } catch (SQLException e) {
            throw new DataAccessException("执行:"+sql+"异常",e);
        }finally {
            ConnectionManager.closeConnection(connection);
        }

    }
    public static <T> T query(String sql, ResultSetHandler<T> handler, Object...params){

        Connection connection = ConnectionManager.getConnection();
        QueryRunner queryrunner = new QueryRunner();
        try {
            return queryrunner.query(connection,sql,handler,params);

        } catch (SQLException e) {
            throw new DataAccessException("执行:"+sql+"异常",e);
        }finally {
            ConnectionManager.closeConnection(connection);
        }

    }


}
