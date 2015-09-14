package org.zerock.web;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by oopchoi on 15. 9. 14..
 */
public class MySQLConnectionTest {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";
    private static final String USER = "zerock";
    private static final String PW = "zerock";

    @Test
    public void testConnection() throws Exception{
        Class.forName(DRIVER);
        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
            System.out.println(con);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
