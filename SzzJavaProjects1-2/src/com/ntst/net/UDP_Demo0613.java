package com.ntst.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

//和课上讲的不一样哈

/* 单元七：网络编程
 *  任务三：UDP通讯
 *
 * 案例：多线程的UDP通信
 */
class Send extends Thread{
    @Override
    public void run() {
        try {
            //1.创建码头对象
            DatagramSocket socket = new DatagramSocket();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String str = scanner.nextLine();//准备要发送的数据
                if ("quit".equals(str)){
                    break;
                }
                //2.创建集装箱对象 把数据放置进去
                DatagramPacket packet =
                        new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 10086);
                //3.发生数据：码头对象发送
                socket.send(packet);
            }
            //4.关闭码头
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//定义接收端
class Receive extends Thread{
    @Override
    public void run() {
        try {
            //1.创建码头对象
            DatagramSocket socket = new DatagramSocket(10086);
            //2.创建接收数据的集装箱
            DatagramPacket packet = new DatagramPacket(new byte[1024],0,1024);
            while(true){
                //3.码头接收货物
                socket.receive(packet);
                //4.取得集装箱中的数据
                byte[] arr = packet.getData();
                int len = packet.getLength();
                String ip = packet.getAddress().getHostAddress();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
public class UDP_Demo0613 {
    public static void main(String[] args) {
        //1.启动服务
        new Receive().start();
        new Send().start();
    }
}
