package com.ntst.coffee;

import java.util.ArrayList;
import java.util.List;

public class SybCoffee implements Franchise{
    //定义菜单列表
    private List<MenuItem> menu= new ArrayList<>();
    //定义顾客列表
    private List<Customer> customers = new ArrayList<>();

    //设置菜单
    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
    //获取顾客列表
    public List<Customer> getCustomers() {
        return customers;
    }
    //设置顾客列表
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    //构造方法，初始化菜单和顾客
    public SybCoffee(){
        //初始化菜单
        menu.add(new MenuItem("拿铁", 25.0));
        menu.add(new MenuItem("卡布奇诺", 30.0));
        menu.add(new MenuItem("美式咖啡", 20.0));
        customers.add(new Customer("沈彦彬", "2058151603@qq.com"));
        //customers.add(new Customer("小狗队长", "1914962228@qq.com"));
        //customers.add(new Customer("王老师", "bizzbee@163.com"));
    }
    //打折方法
    @Override
    public void Discount(double discountRate) {
        for (MenuItem item : menu) {
            double discountedPrice = item.getPrice() * discountRate;
            item.setPrice(discountedPrice);
        }
        System.out.println("Syb咖啡冬季促销:，全店打"+discountRate*10+"折");
    }
    //新产品方法
    @Override
    public void NewProduct(MenuItem menuItem) {
        menu.add(menuItem);
        System.out.println("Syb咖啡新推出"+menuItem.getName()+"，新品价为"+menuItem.getPrice());
    }
    //获取菜单方法
    @Override
    public List<MenuItem> getMenu() {
            return menu;
    }
    //处理投诉方法
    @Override
    public void HandleComplaint(String complaint) {
        System.out.println("Syb咖啡的口感有待提升......");
    }

}
