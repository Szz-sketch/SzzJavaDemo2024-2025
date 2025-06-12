package com.ntst.marketSystem;

// 定义一个消费者类
public class Consumer {
    // 定义消费者姓名
    private String name;

    // 获取消费者姓名
    public String getName() {
        return name;
    }

    // 设置消费者姓名
    public void setName(String name) {
        this.name = name;
    }

    // 消费者购物方法，传入超市对象和商品名称，返回商品对象
    public Goods shopping(Supermarket s, String goodName) {
        return s.sellGoods(goodName);
    }
}
