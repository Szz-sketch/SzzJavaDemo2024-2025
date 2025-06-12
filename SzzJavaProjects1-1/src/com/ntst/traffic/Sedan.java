package com.ntst.traffic;
/*沈彦彬 */
public class Sedan extends Car {
    // 定义舒适度变量
    private double comfortLevel;
    // 定义空间变量
    // 定义一个int类型的变量zone
    private int zone;
    
    // 无参构造方法
    public Sedan() {
    }

    // 有参构造方法
    public Sedan(String brand, String model,double price, int year, String color,double comfortLevel, int zone) {
        // 调用父类的set方法设置品牌、型号、价格、年份、颜色
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setYear(year);
        setColor(color);

        // 设置舒适度和空间
        this.comfortLevel = comfortLevel;
        this.zone = zone;
    }
    // 重写display方法
    @Override
    public void display() {
        // 调用父类的display方法
        super.display();
        // 输出舒适度和空间
        System.out.println("舒适度：" + comfortLevel);
        System.out.println("空间：" + zone);
    }

}
