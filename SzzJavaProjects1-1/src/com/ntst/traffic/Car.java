package com.ntst.traffic;
/*沈彦彬 */
public class Car {
    // 品牌属性
    private String brand;
    // 型号属性
    private String model;
    // 价格属性
    private double price;
    // 生产年份属性
    private int year;
    // 颜色属性
    private String color;

    // 无参构造方法
    public Car() {
    }

    // 有参构造方法
    public Car(String brand, String model, double price,int year,String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
    }
     // 设置车辆信息的方法
     public void setInfo(String brand, String model,double price, int year, String color) {
    	 this.brand=brand;
    	 this.model=model;
    	 this.price=price;
    	 this.year=year;
    	 this.color=color;
     }
     
     // 获取品牌的方法
     public String getBrand() {
        return brand;
    }

    // 设置品牌的方法
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 获取型号的方法
    public String getModel() {
        return model;
    }

    // 设置型号的方法
    public void setModel(String model) {
        this.model = model;
    }

    // 获取价格的方法
    public double getPrice() {
        return price;
    }

    // 设置价格的方法
    public void setPrice(double price) {
        this.price = price;
    }

    // 获取生产年份的方法
    public int getYear() {
        return year;
    }

    // 设置生产年份的方法
    public void setYear(int year) {
        this.year = year;
    }

    // 获取颜色的方法
    public String getColor() {
        return color;
    }

    // 设置颜色的方法
    public void setColor(String color) {
        this.color = color;
    }

    // 显示车辆信息的方法
    public void display()
    {
    	System.out.println("品牌: "+brand);
        System.out.println("型号: "+model);
        System.out.println("售价: "+price);
        System.out.println("生产年份: "+year);
        System.out.println("颜色: "+color);;
    }
    // 重写toString()方法
    @Override
    public String toString() {
    	return "Brand: "+brand+"Model: "+model+"Price: "+price+"Year: "+year+"Color: "+color;
    }
    

}
