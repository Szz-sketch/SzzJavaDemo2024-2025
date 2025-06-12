package com.ntst.io;

import java.io.Serializable;
/*
 * 任务5：序列化与反序列化
 * 1.对象序列化(Serializable)是指将一个Java对象转换成一个I/O流的字节序列的过程。
 * 2.反序列化（Deserialize）是指将I/O流中的字节序列恢复为Java对象的过程
 *
 *   Serializable接口是Java序列化机制的基础，它定义了序列化对象的标准格式，
 *   Serializable接口 （简单，推荐使用）和Externalizable接口实现序列化机制
 *   案例：定义一个类Person，实现序列化
 */
class Person implements Serializable {
     //serialVersionUID默认1L，对象序列化机制是通过判断类的serialVersionUID来验证版本一致性
     private static final long serialVersionUID = 1L;
     //定义成员
}
public class SerializableDemo0508 {
     public static void main(String[] args) {

     }
}
