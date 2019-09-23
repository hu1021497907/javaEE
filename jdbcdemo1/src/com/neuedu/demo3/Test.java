package com.neuedu.demo3;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws Exception {
//        MyDataSource myDataSource = new MyDataSource("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf - 8",
//                "root","root");
//        Connection conn = myDataSource.getConnection();
//        try {
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        myDataSource.getConnection();


        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("util.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");

        //getConnection返回的不是DriverManager.getConnection获得连接的对象，是包装了DriverManager.getConnection的对象
        Connection conn = druidDataSource.getConnection();


    }
}
