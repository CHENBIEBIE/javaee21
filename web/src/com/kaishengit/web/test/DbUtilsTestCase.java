package com.kaishengit.web.test;


import com.kaishengit.web.utli.ConnectionManager;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DbUtilsTestCase {

    @Test
    public void testSave(){

        QueryRunner queryRunner = new QueryRunner();

        String sql = "insert into t_user(username,password,address) value(?,?,?)";

        Connection connection = ConnectionManager.getConnection();
        try {
            queryRunner.update(connection,sql,"jack","123123","USA");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
