package com.ntst.exception;

// 定义一个Person类
public class Person {

    // 定义一个introduce方法，抛出UnsupportedOperationException异常
    public void introduce() {
        throw new UnsupportedOperationException("Unimplemented method 'introduce'");
    }

}
