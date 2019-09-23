package com.neuedu.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库工具类
 */
public class DBUtils {

    /**
     * 查询数据库，万能查询
     * @param c
     * @param <T>
     * @return
     */
    public static <T>List<T>queryAll(Class c){
        //获得表名
        /**
         * 反射类上的注解
         * 如果有用注解属性值
         * 没有用类名
         */
        Table table = (Table) c.getDeclaredAnnotation(Table.class);
        String className = "";
        if (table == null) {
            className = c.getSimpleName();
        }else {
            className = table.name();
        }

        //利用反射出的名字生成sql语句
        String sql = "select * from " + className;

        //jdbc相关
        Connection conn = null;
        PreparedStatement psta = null;
        ResultSet rs = null;
        List<T> list = new ArrayList<>();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?useUnicode=true&characterEncoding=utf-8&useSSL=false",
                    "root","root");
            psta = conn.prepareStatement(sql);
            rs = psta.executeQuery();
            while (rs.next()) {
                Field[] fields = c.getDeclaredFields();
                //创建一个对象
                //通过无参数构造器创建对象
                T t = (T) c.newInstance();
                for (Field field : fields) {
                    //反射出属性名，拿这个名字当前数据库的字段名去结果集里获取数据并且设置到对象上

                    //强制开权限
                    field.setAccessible(true);
                    //获取注解里的信息，信息代表数据库的列名
                    Column column = field.getDeclaredAnnotation(Column.class);
                    String fieldName = "";
                    //如果有注解使用属性名
                    if (column == null) {
                        fieldName = field.getName();
                    }else {
                        //使用注解的属性
                         fieldName = column.name();
                    }
                    //t对象设置值
                    field.set(t,rs.getObject(fieldName));
                }
                //将对象添加到集合中
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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


        return list;
    }
}
