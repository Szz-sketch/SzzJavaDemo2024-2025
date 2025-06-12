package com.ntst.test;

public class Ex05 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.setAge(-3);
        stu1.setName("张三");
        stu1.introduce();
        stu2.setAge(18);
        stu2.setName("沈彦彬");
        stu2.introduce();
    }
}