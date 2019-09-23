package com.neuedu.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {
        //1.建立网络连接，数据库连接
        //连接字符串  用户名 密码
        //jdbc:mysql://[ip地址]:[端口号]/[要连接的database名]
        Connection conn = null;
        Statement sta = null;
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode = true & characterEncoding = utf - 8","root","root");
             //2.从连接中获得sql语句执行的对象
             sta = conn.createStatement();
             //3.定义一条sql
             String sql = "insert into t1 (score) values (60) ";
             //4.执行sql语句得到结果
             //此时的update不是指的是数据库中的update语句，而是指的是能改变数据的语句
             //一个int的返回值代表着你这条语句影响了数据库中的多少行
             int count = sta.executeUpdate(sql);
             //5.处理结果
             if (count > 0){
                 System.out.println("插入数据成功");
             }else {
                 System.out.println("插入数据失败");
             }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
