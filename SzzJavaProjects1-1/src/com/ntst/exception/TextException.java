package com.ntst.exception;

public class TextException {
    @SuppressWarnings("null")
    public static void main(String[] args) {     
    try {
    // 定义一个整型数组
    int[] array = {1, 2, 3, 4, 5};
    // 声明一个未使用的变量
    @SuppressWarnings("unused")
    int b = array[10];
    // 输出字符串
    System.out.println("谢谢");
    // 声明一个Person对象，并赋值为null
    Person p = null;
    // 调用Person对象的introduce方法
    p.introduce();
    } catch (ArithmeticException e) {
        
        // 捕获算数异常
    System.out.println(e);
    System.out.println("出现算数异常");
    } catch (ArrayIndexOutOfBoundsException e) {
        
        // 捕获数组越界异常
    System.out.println(e);
    System.out.println("出现数组越界异常");
    } catch (NullPointerException e) {
        
        // 捕获空指针异常
    System.out.println(e);
    System.out.println("出现空指针异常");
    }finally {
       
        // 无论是否出现异常，都会执行
        System.out.println("我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，我是沈彦彬，不管是否出现异常，我都会出现");
    }
    }
}

