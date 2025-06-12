package com.ntst.encapsulation;

public class Ex05 {
    public static void main(String[] args) {
        // 创建两个Student对象
        Student stu1 = new Student();
        Student stu2 = new Student();
        // 设置stu1的年龄和姓名
        stu1.setAge(20);
        stu1.setName("syb");
        // 调用stu1的introduce方法
        stu1.introduce();
        // 设置stu2的年龄和姓名
        stu2.setAge(18);
        stu2.setName("沈彦彬");
        // 调用stu2的introduce方法
        stu2.introduce();
     }
}
