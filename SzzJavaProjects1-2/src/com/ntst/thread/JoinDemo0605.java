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
class JoinThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName()+"正在输出："+i);
        }
    }
}
public class JoinDemo0605 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程
        Thread joinThread = new Thread(new JoinThread(),"新线程");
        //启动线程
        joinThread.start();

        for  (int i = 1; i <= 5; i++){
            if (i == 2){
                joinThread.join();//谁插队，谁调用
            }
            System.out.println(Thread.currentThread().getName()+"正在输出："+i+"~~~~~~");
        }
    }
}
