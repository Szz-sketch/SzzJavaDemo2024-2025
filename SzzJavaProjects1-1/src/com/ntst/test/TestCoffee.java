package com.ntst.test;

import java.util.List;
import com.ntst.coffee.Customer;
import com.ntst.coffee.MenuItem;
import com.ntst.coffee.SybCoffee;
import com.ntst.util.EmailSender;

public class TestCoffee {
    public static void main(String[] args) {
        // 创建SybCoffee对象
        SybCoffee SybCoffee1 = new SybCoffee();
        // 调用Discount方法，设置折扣为0.5
        SybCoffee1.Discount(0.5);
        // 获取菜单
        List<MenuItem> menu = SybCoffee1.getMenu();
        // 打印菜单
        System.out.println(menu); 
        // 遍历所有顾客
        for(Customer customer : SybCoffee1.getCustomers()) {
            // 发送邮件
            EmailSender.sendEmail(customer.getEmail(), "syb咖啡冬天新品特促", "syb推出新豆角味咖啡，黄磊老师联名，喝了不洗胃，冬天新品特促，买二送一，何炅老师特推！");
        }
        }
    }

