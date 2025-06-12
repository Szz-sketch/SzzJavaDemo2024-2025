package com.ntst.test;

// 导入com.ntst.life包中的Phone类
import com.ntst.life.Phone;

// 定义TestPhone类
public class TestPhone {
    // 定义三个Phone对象
    Phone phone = new Phone();
    Phone phone2 = new Phone();
    Phone phone3 = new Phone();
    // 主方法
    public static void main(String[] args) {
        // 输出Phone类的getTotalPrice方法返回的值
        System.out.println(Phone.getTotalPrice() );
    }
}
