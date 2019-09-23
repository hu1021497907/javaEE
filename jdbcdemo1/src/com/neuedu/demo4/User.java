package com.neuedu.demo4;

@Table(name = "s_user")
public class User {

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private String sex;
    private Integer age;

    public void a(){
        System.out.println("aaa");
    }

    public void b(){
        System.out.println("bbb");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
