package com.ntst.job;

public class Position {

 
    // 职位名称
    private String title;
   
    // 薪资
    private double salary; 
   
    // 部门
    private String department; 

// 构造函数，用于初始化职位名称、薪资和部门
public Position(String title, double salary, String department) {
    this.title = title;
    this.salary = salary;
    this.department = department;
}

// 显示职位信息
public void displayInfo() {
    System.out.println("职位名称: " + title);
    System.out.println("薪资: " + salary + " 元");
    System.out.println("部门: " + department);
}
// 获取职位名称
public String getTitle() {
    return title;
}
// 设置职位名称
public void setTitle(String title) {
    this.title = title;
}
// 获取薪资
public double getSalary() {
    return salary;
}
// 设置薪资
public void setSalary(double salary) {
    this.salary = salary;
}
// 获取部门
public String getDepartment() {
    return department;
}
public void setDepartment(String department) {
    this.department = department;
}
@Override
// 重写toString方法，用于返回职位信息的字符串表示
public String toString() {
    return "Position [title=" + title + ", salary=" + salary + ", department=" + department + "]";
}

    
}
