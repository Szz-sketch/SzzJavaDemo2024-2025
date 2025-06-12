package com.ntst.thread;
/*
 * 任务————Thread类与Runnable接口实现多线程方式的对比
 * 应用场景：假设售票厅有四个窗口可发售某日某次列车的100张车票，
 *          这时，100张车票可以看作共享资源，四个售票窗口同时售票，可以看作四个线程同时运行
 *          为了更直观的显示窗口的售票情况，可以调用Thread的currentThread()方法获取当前的线程的实例对象，
 *          然后调用getName()方法可以获取到当前线程的名称
 *
 * 方式一：Thread类 —————— 问题：100张车票不是共享资源，而是四个窗口各自都有100张车票，使得售票逻辑出现错误，违背实际
 *                ？？？如何解决？？？
 * 方式二：Runnable接口
 * 结论：四个窗口就是4个线程，正在实现了100张车票的资源共享
 */

//首先，定义出售票窗口类
class TicketWindow2 implements Runnable {
    private int tickets = 100;//共享资源
    @Override
    public void run() {
        //窗口售票：有车票就可以发售，销售一张，就少一张
        while(tickets>0){
            System.out.println(Thread.currentThread().getName() + "正在发售第" + tickets-- + "张车票");
        }
    }
}
public class TicketsDemo2_0530 {
    public static void main(String[] args) {
        //创建实现类对象
        TicketWindow2 ticketWindow2 = new TicketWindow2();
        //创建线程对象
        Thread t1 = new Thread(ticketWindow2,"窗口1");
        Thread t2 = new Thread(ticketWindow2,"窗口2");
        Thread t3 = new Thread(ticketWindow2,"窗口3");
        Thread t4 = new Thread(ticketWindow2,"窗口4");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
