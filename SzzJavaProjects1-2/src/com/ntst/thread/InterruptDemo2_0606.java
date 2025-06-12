package com.ntst.thread;
/*
 * 单元六：多线程
 *  任务五：线程操作的相关方法
 *      1.线程优先级：1~10
 *      2.线程休眠：sleep()
 *      3.线程插队：join()
 *      4.线程让步：yield()
 *      5.线程中断：interrupt(),isInterrupted()
 *          在线程生命周期的不同状态，中断机制是不同的
 *          1)新建状态：不可能中断
 *          2)运行状态：可以中断，但一段时间后，线程会恢复到执行状态
 */
class InterruptThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()+"正在输出："+i);
            if (i == 5) {
                Thread.currentThread().interrupt();
                System.out.println("线程是否已中断---"+Thread.currentThread().isInterrupted()+"正在输出："+i);
            }
        }
    }
}
public class InterruptDemo2_0606 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程
        Thread thread = new Thread(new InterruptThread2());
        //说明：当前线程未启动，处于新建状态,不可能被中断
        //启动线程
        thread.start();
        //线程中断方法的调用
        thread.interrupt();
        System.out.println("当前线程是否中断？"+thread.isInterrupted());
    }
}
