package com.ntst.net;
//这个别抄我还在看
//这个别抄我还在看
//这个别抄我还在看
//我想把它单独分离到后端
//等我学会xml再说吧
/*
 * 单元七：网络编程
 *  任务二：TCP通讯
 *     1、Socket类用于编写客户端程序，用户通过创建一个Socket对象建立与服务器的连接。
 *     2、  ServerSocket(int port)  最常用的构造方法
 *     3、Socket accept()  该方法用于等待客户端的连接
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCP_Demo0612 {

    // 服务器端逻辑
    public static void startServer() {
        int port = 12345; // 服务器监听的端口号

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("服务器正在运行，等待客户端连接...");

            Socket clientSocket = serverSocket.accept(); // 等待客户端连接
            System.out.println("客户端已连接");

            // 获取输入流
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // 获取输出流
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("收到客户端消息: " + inputLine);
                out.println("服务器收到: " + inputLine); // 回复客户端
            }

            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 客户端逻辑
    public static void startClient() {
        String host = "localhost"; // 服务器地址
        int port = 12345; // 端口号

        try (Socket socket = new Socket(host, port)) {
            // 获取输出流
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // 获取输入流
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 从控制台读取输入
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput); // 发送消息给服务器
                System.out.println("服务器响应: " + in.readLine()); // 读取服务器回复
            }

            out.close();
            in.close();
            stdIn.close();
        } catch (UnknownHostException e) {
            System.err.println("未知主机: " + host);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("I/O 错误");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("选择模式：1 - 启动服务器，2 - 启动客户端");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                startServer(); // 启动服务器
                break;
            case 2:
                startClient(); // 启动客户端
                break;
            default:
                System.out.println("无效的选择");
        }
    }
}

