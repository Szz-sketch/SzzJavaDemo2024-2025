package com.ntst.marketSystem;

public class Supermarket {
    // 超市名称
    private String name;
    // 货物数组
    private Goods[] store;

    // 获取超市名称
    public String getName() {
        return name;
    }

    // 设置超市名称
    public void setName(String name) {
        this.name = name;
    }

    // 获取货物数组
    public Goods[] getStore() {
        return store;
    }

    // 设置货物数组
    public void setStore(Goods[] store) {
        this.store = store;
    }

    // 卖货行为

    public Goods sellGoods(String name) {
        // 遍历货物数组
        for (int i = 0; i < store.length; i++) {
            // 如果货物名称与传入的名称相同
            if (store[i].getName() == name) {
                return store[i];
            }
        }
        return null;

    }
}
