package com.neuedu.util;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Emp> empList = DBUtils.queryAll(Emp.class);
        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }

}
