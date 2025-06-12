package com.ntst.test;

public class Student {
    private String name;
    private int age;

    public void setName(String stuName) {
        name = stuName;
    }

    public void setAge(int stuAge) {
        if (stuAge <=0) {
            System.out.println("您输入的年龄必须大于等于0！");
        }else {
            age = stuAge;
        }
    }
    public void introduce() {
        System.out.println("大家好，我叫" + name + "，今年年龄" + age+"岁。");
    }
}
