package com.ntst.thread;
/*
 * 单元六：多线程
 *  任务六：线程同步
 *      线程安全：多个线程访问共享资源时，会引发一些安全问题
 *      怎么解决？
 *          ————实现多线程同步
 */
class SaleThread implements Runnable{
    private int tickets = 10;
    @Override
    public void run() {
        while(tickets>0){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在发售第" + tickets-- + "张车票");
        }
    }
}
public class SaleDemo0606 {
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
