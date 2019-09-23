package com.neuedu.demo1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {

    public static void main(String[] args) {
        Connection conn = null;
        Statement sta = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode = true & characterEncoding = utf - 8","root","root");
            sta = conn.createStatement();
            String sql = "select * from course";
            //ResultSet叫做结果集，类似于迭代器
            ResultSet rs = sta.executeQuery(sql);
            List<Course> courseList = new ArrayList<>();
            while (rs.next()) {
                //获得Cno属性的值，并且转化为String类型
                String Cno = rs.getString("Cno");
                String Cname = rs.getString("Cname");
                int Credit = rs .getInt("Credit");
                int Semester = rs.getInt("Semester");
//                System.out.println(Cno);
//                System.out.println(Cname);
//                System.out.println(Credit);
//                System.out.println(Semester);
                //将数据库里的一条数据映射成一个Java对象
                Course c = new Course();
                c.setCno(Cno);
                c.setCanme(Cname);
                c.setCredit(Credit);
                c.setSemester(Semester);
                //将这个对象存入到集合中
                courseList.add(c);
            }
            for (Course course : courseList) {
                System.out.println(course);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
