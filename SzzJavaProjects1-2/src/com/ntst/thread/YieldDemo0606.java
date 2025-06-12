package com.ntst.thread;
/*
 * 单元六：多线程
 *  任务五：线程操作的相关方法
 *      1.线程优先级：1~10
 *      2.线程休眠：sleep()
 *      3.线程插队：join()
 *      4.线程让步：yield()
 *      5.线程中断：interrupt(),isInterrupted()
 */
class YieldThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 6; i++){
            System.out.println(Thread.currentThread().getName()+"正在输出："+i);
            if (i == 2){
                System.out.println("线程让步");
                Thread.yield();
            }
        }
    }
}
public class YieldDemo0606 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程
        Thread thread1 = new Thread(new YieldThread());
        Thread thread2 = new Thread(new YieldThread());
        //启动线程
        thread1.start();
        thread2.start();
    }
}
