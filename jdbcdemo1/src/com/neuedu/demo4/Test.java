package com.neuedu.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Table
public class Test {

    public static void main(String[] args) {
//        Class  c = User.class;
//        User user = new User();
//        Class c = user.getClass();
        try {
            //c对象记录了User这个类有哪些属性和方法
            Class c = Class.forName("com.neuedu.demo4.User");

            //通过c对象获取这个类的构造函数，不传参数代表获取无参构造函数
            //参数列表的类型顺序
            Constructor userConstructor = c.getDeclaredConstructor();
            //调用newInstance方法创建对象
            User user = (User) userConstructor.newInstance();
            System.out.println(user);

//            Method[] ms = c.getDeclaredMethods();
//            for (Method m : ms) {
//                m.invoke(user);//user.a()  user.b()
//            }

//            System.out.println(user.getAge());

            Field f = c.getDeclaredField("age");

            f.setAccessible(true);
            f.set(user, 1);
//            System.out.println(user.getAge());

            Method m = c.getDeclaredMethod("getAge");
            Integer age = (Integer) m.invoke(user);
            System.out.println(age);

            //根据方法名获取方法
//            Field f = c.getDeclaredField("a");

//            Field[] fs = c.getDeclaredFields();
//            System.out.println(fs.length);
//            for (Field f : fs) {
//                System.out.println(f);
//            }
//
//            Method[] ms = c.getDeclaredMethods();
//            for (Method m : ms) {
//                System.out.println(m);
//            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }


}
