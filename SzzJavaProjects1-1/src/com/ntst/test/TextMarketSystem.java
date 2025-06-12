package com.ntst.test;

import com.ntst.marketSystem.Consumer;
import com.ntst.marketSystem.Goods;
import com.ntst.marketSystem.Supermarket;

public class TextMarketSystem {
    public static void main(String[] args) {
        // 创造商品对象
        Goods g1 = new Goods("杯子");
        Goods g2 = new Goods("纸巾");
        Goods g3 = new Goods("豆浆粉");
        Goods g4 = new Goods("电脑");
        Goods g5 = new Goods("药品");
        // 创造商品对象
        Supermarket m = new Supermarket();
        m.setName("合家福购物中心");
        m.setStore(new Goods[] { g4, g5 });

        Supermarket s = new Supermarket();
        s.setName("大润发");
        s.setStore(new Goods[] { g1, g2, g3 });

        // 创建顾客对象
        Consumer c1 = new Consumer();
        c1.setName("Tom");

        Consumer c2 = new Consumer();
        c2.setName("Jerry");

        Consumer c3 = new Consumer();
        c3.setName("Mike");

        // Tom在合家福购物中心买到了豆浆粉
        Goods gol = c1.shopping(m, "豆浆粉");

        if (gol != null) {
            System.out.println(c1.getName() + "在" + m.getName() + "买到了" + gol.getName() + "。");
        } else {
            System.out.println(c1.getName() + "在" + m.getName() + " 什么都没有买到");
        }

        // Jerry在大润发什么都没有买到
        Goods go2 = c2.shopping(s, "豆浆粉");
        if (go2 != null) {
            System.out.println(c2.getName() + "在" + s.getName() + "，买到了" + go2.getName() + "。");
        } else {
            System.out.println(c2.getName() + "在" + s.getName() + "什么都没有买到");
        }
        System.out.println("--------沈彦彬--------");

    }

}
