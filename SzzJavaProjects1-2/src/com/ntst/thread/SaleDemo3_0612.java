package com.ntst.thread;

/*
 * 单元六：多线程
 *  任务六：线程同步
 *      线程安全：多个线程访问共享资源时，会引发一些安全问题
 *      怎么解决？
 *          ————实现多线程同步
 *  案例结论：当前线程是不安全的
 *    1.同步代码块：synchronized (lock){}
 *    2.同步方法：synchronized 返回值类型 方法名([参数1,...]){}
 */
class SaleThread3 implements Runnable {
    private int tickets = 10;//共享资源

    @Override
    public void run() {
        //窗口售票：有车票就可以发售
        while (true) {
            saleTicket();//售票
            if  (tickets <= 0) {
                break;
            }
        }
    }
    //重点：定义同步方法，窗口进行售票
    private synchronized void saleTicket() {
        if  (tickets > 0) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets-- + "张车票");
          }
    }
}

public class SaleDemo3_0612 {
    public static void main(String[] args) throws InterruptedException {
        //模拟四个售票窗口，创建四个线程
        SaleThread3 saleThread3 = new SaleThread3();

        Thread thread1 = new Thread(saleThread3,"窗口1");
        Thread thread2 = new Thread(saleThread3,"窗口2");
        Thread thread3 = new Thread(saleThread3,"窗口3");
        Thread thread4 = new Thread(saleThread3,"窗口4");
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
