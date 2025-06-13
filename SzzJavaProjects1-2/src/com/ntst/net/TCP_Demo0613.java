package com.ntst.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//与课上讲的略有不同
/*
 * 单元七：网络编程
 *  任务二：TCP通讯
 * TCP通信需要创建一个服务器端程序和一个客户端程序
 *  1.ServerSocket类的主要作用是接收客户端的连接请求
 *    ServerSocket(int port)是最常用的构造方法，参数为服务器监听的端口号
 *    Socket accept()方法用于接收客户端的连接请求，返回一个Socket对象，该对象封装了客户端的输入输出流
 *
 *   2.Socket类用于编写客户端程序，用户通过创建一个Socket对象建立与服务器的连接
 *     Socket()最常用的构造方法
 *     int getPort() 获取Socket对象所连接的远程服务器的端口号
 */
//案例：多线程的TCP通信
public class TCP_Demo0613 {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象，并指定监听的端口号
        ServerSocket serverSocket = new ServerSocket(10086);
        //使用while循环不停地接收客户端发送的请求
        while (true) {
            //2.调用Socket类的accept()方法等待客户端的链接
            final Socket client = serverSocket.accept();
            int port = client.getPort();
            System.out.println("与端口号为"+port+"的远程客户端连接成功");
            //创建一个线程，为该线程指定一个任务，即处理客户端的请求
            new Thread() {
                @Override
                public void run() {
                    //定义一个输出流对象
                    OutputStream out = null;
                    //获取客户端的输出流
                    try {
                        out = client.getOutputStream();
                        System.out.println("开始与客户端交互数据");
                        out.write("你好".getBytes());//输出流--写操作
                        //线程休眠五秒
                        Thread.sleep(5000);//模仿与客户端交流花费的时间

                        out.close();//关闭输出流
                        client.close();//关闭Socket对象
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }.start();
        }

    }
}
