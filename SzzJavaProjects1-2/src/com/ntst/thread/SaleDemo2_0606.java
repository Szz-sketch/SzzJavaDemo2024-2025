package com.ntst.thread;

/*
 * 单元六：多线程
 *  任务六：线程同步
 *      线程安全：多个线程访问共享资源时，会引发一些安全问题
 *      怎么解决？
 *          ————实现多线程同步
 *  案例结论：当前线程是不安全的
 *  同步代码块：synchronized (lock){}
 */
class SaleThread2 implements Runnable {
    private int tickets = 10;//共享资源
    Object lock = new Object();//定义任意一个对象，用作同步代码块的锁

    @Override
    public void run() {
        //窗口售票：有车票就可以发售
        while (true) {
            synchronized (lock) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在发售第" + tickets-- + "张车票");
                } else {
                    break;
                }
            }
        }
    }
}

public class SaleDemo2_0606 {
    public static void main(String[] args) throws InterruptedException {
        //模拟四个售票窗口，创建四个线程
        SaleThread saleThread = new SaleThread();

        Thread thread1 = new Thread(saleThread,"窗口1");
        Thread thread2 = new Thread(saleThread,"窗口2");
        Thread thread3 = new Thread(saleThread,"窗口3");
        Thread thread4 = new Thread(saleThread,"窗口4");
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
