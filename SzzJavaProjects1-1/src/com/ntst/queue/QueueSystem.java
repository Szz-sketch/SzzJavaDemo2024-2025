package com.ntst.queue; // 定义包名，用于组织代码

import java.util.ArrayList; // 导入ArrayList类，用于存储列表数据
import java.util.HashMap; // 导入HashMap类，用于存储键值对数据
import java.util.List; // 导入List接口，用于存储列表数据

public class QueueSystem {
    private static HashMap<Integer, Table> tables = new HashMap<>(); // 定义一个HashMap，用于存储桌子和对应的编号
    private static List<CustomerGroup> waitingQueue = new ArrayList<>(); // 定义一个ArrayList，用于存储等待的顾客组
    
    // 添加顾客组到等待队列
    private static void addCustomer(CustomerGroup customer) {
        waitingQueue.add(customer);
        System.out.println(customer.getName()+"加入了等待队列");
    }

    // 为顾客组分配餐桌
    private static boolean assignTableToCustomer(CustomerGroup customer ){
        for (Table table : tables.values()) {
            if (!table.isOccupied()) {
                table.occupy();
                System.out.println(customer.getName()+"占用了餐桌"+table.getNumber());
                return true;
            }   
        }
        System.out.println("没有空余的桌子给"+customer.getName());
        return false;
    }
    public static void main(String[] args) {
        // 创建10个桌子对象，并初始化编号和占用状态
        for (int i = 0; i <= 10; i++) {
            tables.put(i, new Table(i, false));
        }
        // 添加顾客组到等待队列
        addCustomer(new CustomerGroup("syb和他的朋友", 2));
        addCustomer(new CustomerGroup("两对情侣", 4));
        // 为等待队列中的第一个顾客组分配餐桌
        assignTableToCustomer(waitingQueue.get(0));
    }
}
