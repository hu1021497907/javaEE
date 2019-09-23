package com.neuedu.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.neuedu.dao.CourseDAO;
import com.neuedu.demo1.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    /**
     * 删除
     *
     * @param cno
     * @return
     */
    @Override
    public int deleteCourseByCno(String cno) {
//        Connection conn = null;
//        Statement sta = null;
//        int row = 0;
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8","root","root");
//            sta = conn.createStatement();
//            String sql = "delete from course where cno = '" + cno + "'";
//            System.out.println(sql);
//            row = sta.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            if (sta != null) {
//                try {
//                    sta.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        PreparedStatement psta = null;
        int row = 0;
        try {
            Connection conn = druidDataSource.getConnection();
            psta = conn.prepareStatement("delete from course where cno = '" + cno + "'");
            System.out.println(psta);
            row = psta.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            druidDataSource.close();
            try {
                if (psta != null) {
                    psta.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return row;
    }

    /**
     * 添加
     *
     * @param course
     * @return
     */
    @Override
    public int insertCourseByCno(Course course) {
//        Connection conn = null;
//        Statement sta = null;
//        int row = 0;
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8", "root", "root");
//            sta = conn.createStatement();
//            String sql = "insert into course values ('" + course.getCno() + "','" +
//                    course.getCanme() + "'," + course.getCredit() + "," + course.getSemester() + ")";
//            System.out.println(sql);
//            row = sta.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            if (sta != null) {
//                try {
//                    sta.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return row;
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        PreparedStatement psta = null;
        int row = 0;
        try {
            Connection conn = druidDataSource.getConnection();
            psta = conn.prepareStatement("insert into course values ('" + course.getCno() + "','" +
                    course.getCanme() + "'," + course.getCredit() + "," + course.getSemester() + ")");
            System.out.println(psta);
            row = psta.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            druidDataSource.close();
            try {
                if (psta != null) {
                    psta.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return row;
    }

    /**
     * 修改
     *
     * @param course
     * @return
     */
    @Override
    public int updateCourseByCno(Course course) {
//        Connection conn = null;
//        Statement sta = null;
//        int row = 0;
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8",
//                    "root", "root");
//            sta = conn.createStatement();
//            String sql = "update course set cname = '" + course.getCanme() + "', credit = " + course.getCredit() +
//                    ", semester = " + course.getSemester() + " where cno = '" + course.getCno() + "'";
//
//            System.out.println(sql);
//            row = sta.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            if (sta != null) {
//                try {
//                    sta.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return row;

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        PreparedStatement psta = null;
        int row = 0;
        try {
            Connection conn = druidDataSource.getConnection();
            psta = conn.prepareStatement("update course set cname = '" + course.getCanme() + "', credit = " + course.getCredit() +
                    ", semester = " + course.getSemester() + " where cno = '" + course.getCno() + "'");
            System.out.println(psta);
            row = psta.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            druidDataSource.close();
            try {
                if (psta != null) {
                    psta.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return row;
    }

    /**
     * 查找
     *
     * @return
     */
    @Override
    public List<Course> listCourse() {
//        Connection conn = null;
//        Statement sta = null;
//        ResultSet rs = null;
//        List<Course> courseList = new ArrayList<>();
//
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8",
//                    "root", "root");
//            sta = conn.createStatement();
//            String sql = "select * from course";
//            rs = sta.executeQuery(sql);
//            while (rs.next()) {
//                Course course = new Course();
//                course.setCno(rs.getString("cno"));
//                course.setCanme(rs.getString("cname"));
//                course.setCredit(rs.getInt("credit"));
//                course.setSemester(rs.getInt("semester"));
//                courseList.add(course);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            if (sta != null) {
//                try {
//                    sta.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (rs != null) {
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return courseList;

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/s_t?useUnicode=true&characterEncoding=utf-8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        PreparedStatement psta = null;
        ResultSet rs = null;
        List<Course> courseList = new ArrayList<>();
        try {
            Connection conn = druidDataSource.getConnection();
            psta = conn.prepareStatement("select * from course");
            System.out.println(psta);
            rs = psta.executeQuery();
            while (rs.next()) {
                Course course = new Course();
                course.setCno(rs.getString("cno"));
                course.setCanme(rs.getString("cname"));
                course.setCredit(rs.getInt("credit"));
                course.setSemester(rs.getInt("semester"));
                courseList.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            druidDataSource.close();
            if (psta != null) {
                try {
                    psta.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return courseList;
    }
}
