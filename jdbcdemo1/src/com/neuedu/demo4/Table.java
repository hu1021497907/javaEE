package com.neuedu.demo4;

import java.lang.annotation.*;

//标注我这个自定义注解可以在什么地方使用
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})

//我这个自定义注解只保留到源代码期间
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    String name() default "name";

}
