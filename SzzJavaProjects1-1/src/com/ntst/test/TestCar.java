package com.ntst.test;
/*沈彦彬 */
import com.ntst.traffic.Sedan;

public class TestCar {
    public static void main(String[] args) {
        // 创建一个Sedan对象，参数分别为品牌、型号、价格、年份、颜色、油耗、座位数
        Sedan sedan = new Sedan("BMW","X5",100000,2020,"Black",8.5,8);
        // 调用Sedan对象的display方法，输出车辆信息
        sedan.display();
        // 输出作者姓名
        System.out.println("沈彦彬");
    }    
}
