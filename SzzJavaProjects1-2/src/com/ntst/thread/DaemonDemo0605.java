package com.ntst.thread;
/*
 * 单元六：多线程
 * 任务三：后台线程
 *      前台线程和后台线程是一种相对的概念，新创建的线程默认是前台线程。
 *      如果某个线程对象再启动前执行了setDaemon(true)方法，这个线程就变成一个后台线程。
 *      对Java程序来说，只要还有一个前台线程在进行，这个线程就不会结束，如果一个进程中只有后台线程运行，这个线程就会结束
 */
class DaemonThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"...线程在运行");
    }
}
public class DaemonDemo0605 {
    public static void main(String[] args) {
        //main主线程
        System.out.println("main线程是后台线程？"+Thread.currentThread().isDaemon());//false

        DaemonThread dt = new DaemonThread();
        Thread thread = new Thread(dt);

        System.out.println("Thread线程是后台线程？"+Thread.currentThread().isDaemon());//false
        //将thread线程设置为后台线程
        thread.setDaemon(true);
        thread.start();
        //模拟main主线程的执行
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
