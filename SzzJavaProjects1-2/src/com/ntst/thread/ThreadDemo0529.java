package com.ntst.thread;
/*
  * 单元六：多线程
  * 任务一：理解·进程(process)和·线程(thread)
  *     进程：计算机程序的一次运行活动
  *     线程：一个进程中可以有多个执行单元同时运行，这些执行单元可以看作是程序执行的线程
  *           每一个进程中，线程之间是相互独立的，互不干扰
  * 任务二：创建线程
  *     1.继承java.lang包中的Thread类，重写Thread类的run()方法，在run()方法中实现多线程代码
  *     2.实现java.lang.Runnable接口，在run()方法中实现多线程代码
  *     3.实现java.util.concurrent.Callable接口，重写call()方法，
  *         并使用 Future 接口获取 call() 方法返回的结果
  *         同时通过 FutureTask 类封装 Callable 接口对象，并创建 Thread 对象启动线程。
  *
  * 案例：方式一：通过继承Thread类创建线程
 */
  //先看单线程例子
class MyThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("MyThread2类的run()方法在运行");
        }
    }
}
public class ThreadDemo0529 {
    public static void main(String[] args) {
//        //创建MyThread类的对象
//        MyThread myThread = new MyThread();
//        myThread.run();
        MyThread2 myThread2 = new MyThread2();//创建子线程类对象
        myThread2.start();//启动线程

        while (true){
            System.out.println("main()方法在运行");
        }
    }
}
