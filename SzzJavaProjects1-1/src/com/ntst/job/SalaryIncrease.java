package com.ntst.job;

// 定义一个SalaryIncrease类
public class SalaryIncrease {
    // 主方法
    public static void main(String[] args) {
        // 创建一个Position对象，参数为职位名称、薪资和部门
        Position p = new Position("Java开发工程师", 8000, "开发部");
        // 调用Position对象的displayInfo方法，显示职位信息
        p.displayInfo();
        // 计算薪资涨幅，涨幅为10%
        System.out.println("薪资涨幅为：" + p.getSalary() * 0.1);
        // 输出作者姓名
        System.out.println("沈彦彬");
    }
}
