package com.ntst.thread;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * 单元六：多线程
 * 任务二：创建线程
 *
 * 方式三：实现java.util.concurrent.Callable接口，重写call()方法，
 *         并使用 Future 接口获取 call() 方法返回的结果
 *         当一个类已经继承了一个父类，就不能再继承Thread类，只能通过实现接口来创建线程
 */
class MyThread4 implements Callable<Object> {
    @Override
    public Object call() {
        int i = 0;
        while(i++ < 5){
            //获取当前线程的名称
            System.out.println(Thread.currentThread().getName() + "的call()方法在运行...");
        }
        return i;//返回值
    }
}
public class ThreadDemo3_0530 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //实例化实现类
        MyThread4 myThread4 = new MyThread4();//实现类对象
        // FutureTask 封装MyThread4类
        FutureTask<Object> futureTask = new FutureTask<Object>(myThread4);
        //创建线程
        Thread thread = new Thread(futureTask, "新线程");
        //启动线程
        thread.start();
        //输出线程的返回值
        System.out.println(Thread.currentThread().getName() + "的call()方法返回值：" + futureTask.get());
        //模拟主线程main
        for (int i = 0; i < 5; i++) {
            System.out.println("main()方法在运行...");

        }
    }
}
