package com.ntst.encapsulation;

public class Student {
    // 定义私有变量name，用于存储学生的姓名
    private String name;
    // 定义私有变量age，用于存储学生的年龄
    private int age;
    // 定义公共方法setName，用于设置学生的姓名
    public void setName(String stuName) {
        name = stuName;
    }
    // 定义公共方法setAge，用于设置学生的年龄
    public void setAge(int stuAge) {
        // 判断年龄是否小于等于0，如果是，则输出错误信息
        if (stuAge <= 0) {
            System.out.println("您输入的年龄必须大于0！");
        } else {
            // 否则，将年龄赋值给私有变量age
            age = stuAge;
        } 
    }
    // 定义公共方法introduce，用于输出学生的姓名和年龄
    public void introduce() {
        System.out.println("大家好，我叫" + name+"我今年" + age+"岁");
        
    }
}
