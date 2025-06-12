package com.ntst.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 单元七：网络编程
 * 任务一：理解 网络术语
 *        TCP/IP四层协议第三层：传输层TCP带连接的协议、UDP无连接的协议
 *        IP地址和端口
 *        InetAddress类的常用方法
 */
public class INetAddressDemo0612 {
    public static void main(String[] args) throws IOException {
        InetAddress localAddress = InetAddress.getLocalHost();
        InetAddress remoteAddress = InetAddress.getByName("www.baidu.com");

        System.out.println("本机的IP地址是：" + localAddress);
        System.out.println("百度的IP地址是：" + remoteAddress);
        System.out.println("判断在三秒内是否可达www.baidu.com这个网址"+remoteAddress.isReachable(3000));

    }
}
