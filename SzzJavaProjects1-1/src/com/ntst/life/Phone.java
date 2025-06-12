package com.ntst.life;

public class Phone {
    // 定义手机品牌
    private String brand;
    // 定义手机型号
    private String model;
    // 定义手机价格
    private double price;

    // 定义手机总价格
    private static double totalPrice;
    // 定义手机数量
    private static double phoneCount;

    // 无参构造方法
    public Phone() {
    }
    // 有参构造方法
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        phoneCount++;
        totalPrice += price;
        System.out.println("创建了"+brand+model+"手机");
    }
    // 获取手机品牌
    public String getBrand() {
        return brand;
    }
    // 设置手机品牌
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // 获取手机型号
    public String getModel() {
        return model;
    }
    // 设置手机型号
    public void setModel(String model) {
        this.model = model;
    }
    // 获取手机价格
    public double getPrice() {
        return price;
    }
    // 设置手机价格
    public void setPrice(double price) {
        this.price = price;
    }
    // 获取手机总价格
    public static double getTotalPrice() {
        return totalPrice;
    }
    // 设置手机总价格
    public static void setTotalPrice(double totalPrice) {
        Phone.totalPrice = totalPrice;
    }
    // 计算平均价格
    public static double calculateAvgPrice(){
        if (phoneCount == 0) return 0.0;
        //double avgPrice = totalPrice/phoneCount;
        return totalPrice/phoneCount; 
    }
    // 增加手机价格
    public void increasePrice(double increment){
         this.price += increment;
    }
    // 重写toString方法
    @Override
    public String toString() {
        return "Phone [品牌=" + brand + ", 型号=" + model + ", 价格=" + price + "]";
    }
    // 主方法
    public static void main(String[] args) {
        // 创建手机对象
        Phone phone = new Phone("HuaWei", "Pura 70", 8999);
        Phone phone2 = new Phone("XiaoMi", "15", 5999);
        Phone phone3 = new Phone("Apple", "15", 7999);
        // 输出平均价格
        System.out.println("平均价格："+Phone.calculateAvgPrice());
        // 输出总价格
        System.out.println("总价格："+Phone.getTotalPrice());
        // 输出手机信息
        System.out.println(phone.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        // 输出作者姓名
        System.out.println("沈彦彬");
    }
    
    }
    

    

