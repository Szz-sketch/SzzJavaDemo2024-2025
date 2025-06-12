package com.ntst.eat;

public class McDonald {

    // 定义一个麦当劳类
    private String name; // 麦当劳的名字
    private double price; // 麦当劳的价格
    private int calories; // 麦当劳的卡路里
    private boolean isDiscount; // 麦当劳是否打折

    // 构造函数，初始化麦当劳的属性
    public McDonald(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.isDiscount = false;
    }

    // 设置麦当劳的属性
    public void setInfo(String name, double price, int calories){
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.isDiscount = false;
    }
    
    // 显示麦当劳的属性
    public void display(){
        System.out.println("----------------------------");
        System.out.println("名字: "+this.name);
        System.out.println("价格: "+this.price+"元");
        System.out.println("卡路里: "+this.calories+"卡路里");
        System.out.println("是否打折: "+(this.isDiscount?"是":"否"));
    }
    // 计算打折后的价格
    public double discountPrice(double discountRate){
        if (isDiscount) {
            double discountPrice = this.price * discountRate;
            return discountPrice;
        } else {
            return this.price;
        } 
    }
    // 添加额外的食物
    public void addExtra(String extra,double extraPrice,int extraCalories){
        System.out.println("添加了："+extra);
        this.price += extraPrice;
        this.calories += extraCalories;
    }
    // 主函数
    public static void main(String[] args) {
        // 创建两个麦当劳对象
        McDonald item = new McDonald("巨无霸", 22.0, 500);
        McDonald item1 = new McDonald("麦旋风", 16.0, 800);       
        // 显示麦当劳的属性
        item.display();
        item1.display();
        // 设置麦当劳的打折属性
        item.isDiscount = true;
        item1.isDiscount = true;
        // 再次显示麦当劳的属性
        item.display();
        item1.display();
        // 计算打折后的价格
        System.out.println(item.name+"打折后价格："+item.discountPrice(0.8)+"元");
        // 添加额外的食物
        item.addExtra("香菜", 2.0, 10);
        // 再次显示麦当劳的属性
        item.display();
       
        System.out.println("沈彦彬");  
    }
       
    }
 
    
     
    






