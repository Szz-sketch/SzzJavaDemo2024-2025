package com.ntst.thread;
/*
 * 单元六：多线程
 * 任务四：线程的生命周期中，基本状态一共有六种
 *      前台线程和后台线程是一种相对的概念，新创建的线程默认是前台线程。
 *      如果某个线程对象再启动前执行了setDaemon(true)方法，这个线程就变成一个后台线程。
 *      对Java程序来说，只要还有一个前台线程在进行，这个线程就不会结束，如果一个进程中只有后台线程运行，这个线程就会结束
 */
class MaxPriority implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + "在输出..." + i+"!!!!!!");
        }
    }
}
class MinPriority implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + "在输出..." + i+"~~~~~~");
        }
    }
}
//class NormalPriority implements Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++){
//            System.out.println(Thread.currentThread().getName() + "在输出..." + i);
//        }
//    }
//}
public class PriorityDemo0605 {
    public static void main(String[] args) {
        //创建两个线程
        Thread MaxPriority = new Thread(new MaxPriority(),"较高优先级");
        Thread minPrioirty = new Thread(new MinPriority(),"较低优先级");

        //设置线程的优先级别
        MaxPriority.setPriority(10);
        MaxPriority.setPriority(Thread.MAX_PRIORITY);

        minPrioirty.setPriority(1);
        minPrioirty.setPriority(Thread.MIN_PRIORITY);

        //启动线程
        MaxPriority.start();
        minPrioirty.start();

    }
}
