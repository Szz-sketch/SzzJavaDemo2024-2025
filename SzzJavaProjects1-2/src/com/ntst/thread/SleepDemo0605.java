package com.ntst.thread;
/*
 * 单元六：多线程
 *
 */
class SleepThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 9; i++){
            if (i == 3){
                try {
                    Thread.sleep(2000);//满足条件，线程就休眠2000毫秒
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("SleepThread线程正在输出："+i);
                try {
                    Thread.sleep(500);//当前线程休眠500毫秒
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
public class SleepDemo0605 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程对象
        Thread sleepThread = new Thread(new SleepThread());
        //启动线程
        sleepThread.start();

        for (int i = 0; i < 9; i++) {
            if  (i == 5) {
                Thread.sleep(2000);
            }
            System.out.println("main主线程在运行..."+i+"~~~~~~");
            Thread.sleep(500);
        }
    }
}
