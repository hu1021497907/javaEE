package com.neuedu.demo4;

public class Test1 {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.neuedu.demo4.User");
        Table t = (Table) c.getDeclaredAnnotation(Table.class);
        System.out.println(t.name());
    }

}
