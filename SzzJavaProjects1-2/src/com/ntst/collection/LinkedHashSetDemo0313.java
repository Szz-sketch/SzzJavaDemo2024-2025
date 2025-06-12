package com.ntst.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Set接口
 * 	HashSet类      TreeSet
 * 		|
 * 	LinkedHashSet类
 * 特点：有序，元素不重复
 */

public class LinkedHashSetDemo0313 {

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        // 创建对象
        LinkedHashSet lhSet = new LinkedHashSet();
        lhSet.add("苹果");
        lhSet.add(999);
        lhSet.add("桔子");

        // 使用迭代器遍历 LinkedHashSet
        Iterator it = lhSet.iterator();
        while (it.hasNext()) {
            Object object = (Object) it.next();
            print(object);
        }
    }
}