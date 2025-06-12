package com.ntst.thread;
/*
 * 单元六：多线程
 * 任务二：创建线程
 *
 * 方式二：通过实现java.lang.Runnable接口创建线程
 * 		  当一个类已经继承了一个父类，就不能再继承Thread类，只能通过实现接口来创建线程
 */
class MyThread3 extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("MyThread3类的run()方法在运行");
        }
    }
}
public class ThreadDemo2_0529 {
        public static void main(String[] args) {
            //创建MyThread3的对象
            MyThread3 myThread3 = new MyThread3();
            //转变成一个线程对象
            Thread thread = new Thread(myThread3);
            thread.start();//启动线程

            while (true){
                System.out.println("main()方法在运行");
            }
        }
    }

