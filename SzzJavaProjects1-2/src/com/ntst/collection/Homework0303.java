package com.ntst.collection;

import java.util.ArrayList;

public class Homework0303 {
    /*
     * 沈彦彬  2025.3.3作业
     * 选择一个主题(“古典小说”)，创建ArrayList列表，进行添删改查遍历操作。
     * 
     */
    public static void print(Object o) {//这是为了方便输出所自定义的方法
        System.out.println(o);
    }
    
    public static void show(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            print(list.get(i));
        }
    }
    
    public static void main(String[] args) {
        //1、创建集合对象
        ArrayList list = new ArrayList();
        list.add("红楼梦");//数据元素的添加
        list.add("聊斋志异");
        list.add("西游记");
        list.add(2, "水浒传"); //2.数据元素，添加到指定位置（第2位置）
        
        print( list.get(2));//数据元素的获取
        
        //3.删除数据
        list.remove(3);      
        list.remove("水浒传"); 
        
        //4.修改数据
        list.set(1, "儒林外史");
        print(list.get(1));
        
        //5.判断集合是否为空
        print("索引集合是否为空？" + list.isEmpty());
        //6.判断数据对象是否在集合中
        print("集合里面包含西游记吗？" + list.contains("西游记"));
        
        //7.遍历
        print("-----以下是索引列表中的全部作品-----");
        show(list);
    }
}