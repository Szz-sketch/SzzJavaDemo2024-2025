package com.ntst.life;
import java.util.Scanner;
public class Grades {
    //书p49
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       // 输入学生人数
       System.out.println("请输入学生人数：");
       int stuNum = sc.nextInt();
       // 输入课程数
       System.out.println("请输入课程数：");
       int couNum = sc.nextInt();
       // 创建学生姓名数组
       String[] name = new String[stuNum];
       // 创建课程名称数组
       String[] course = new String[couNum];
       // 创建成绩二维数组
       int[][] score = new int[stuNum][couNum];
       // 创建总分数组
       int[] sum = new int[stuNum];
       // 创建平均分数组
       int[] avg = new int[stuNum];
       // 创建内容数组
       String[] content = new String[stuNum];
       // 输入课程名称
       for(int i=0;i<couNum;i++){
           System.out.println("请输入第"+(i+1)+"个课程名称：");
           course[i] = sc.next();
       }
       // 输入学生姓名和成绩
    // 遍历学生数量
       for(int i=0;i<stuNum;i++){
    // 输出提示信息，要求输入第i+1个学生的姓名
           System.out.println("请输入第"+(i+1)+"个学生姓名：");
    // 将输入的姓名存入name数组中
           name[i] = sc.next();
    // 将姓名和制表符存入content数组中
           content[i] = name[i]+"\t\t";
    // 遍历课程数量
           for(int j=0;j<couNum;j++){
        // 输出提示信息，要求输入name[i]的course[j]成绩
               System.out.println("请输入"+name[i]+"的"+course[j]+"成绩：");
        // 将输入的成绩存入score数组中
               score[i][j] = sc.nextInt();
        // 将成绩累加到sum数组中
               sum[i] += score[i][j];
        // 将成绩和制表符存入content数组中
               content[i] += score[i][j]+"\t\t";
           }
    // 计算平均成绩
           avg[i] = sum[i]/stuNum;
    // 将总分和平均成绩和制表符存入content数组中
           content[i] += sum[i]+"\t\t"+avg[i]+"\t\t"; 
           }
           // 按总分排序
// 对数组sum进行降序排序
           for(int i=0;i<stuNum-1;i++){ // 外层循环，控制比较的轮数
               for(int j=0;j<stuNum-1;j++){ // 内层循环，控制每一轮的比较次数
                   if (sum[j]<sum[j+1]) { // 如果前一个元素小于后一个元素
                      int t = sum[j]; // 交换两个元素的位置
                      sum[j] = sum[j+1];
                      sum[j+1] = t;
                      String temp = content[j]; // 交换两个元素的位置
                      content[j] = content[j+1];
                      content[j+1] = temp;
                  }
              }
                   }
            // 输出结果
            System.out.print("姓名\t\t");
            // 遍历课程数组，输出课程名称
            for(int i=0;i<couNum;i++){
                System.out.print(course[i]+"\t\t");
            }
            // 输出总分、平均分、排名
            System.out.println("总分\t\t平均分\t\t排名\t\t");
            // 遍历学生数组，输出学生姓名和排名
            for(int i=0;i<stuNum;i++){
                System.out.println(content[i]+"第"+(i+1)+"名\t\t");
            }
                
       }
    
      
       } 
        

