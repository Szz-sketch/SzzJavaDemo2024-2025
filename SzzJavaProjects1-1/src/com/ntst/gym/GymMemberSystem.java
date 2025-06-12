package com.ntst.gym;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class GymMemberSystem {
    //定义一个静态的Map集合，用于存储会员信息
    private static Map<String,Member> members=new HashMap<>();
    //静态方法，用于注册会员
    public static void registerMember(String memberId, String name, String phoneNumber) {
        //创建一个Member对象，并将会员信息存入Map集合中
        Member member=new Member(memberId,name,phoneNumber);
        members.put(memberId,member);
        //输出注册成功的提示信息
        System.out.println(name+"会员注册成功,会员ID为:"+memberId);
    }
    //静态方法，用于更新会员信息
    public static void updateMemberInfo(String memberId, String name, String phoneNumber) {
        //根据会员ID从Map集合中获取会员对象
        Member member=members.get(memberId);
        //更新会员的手机号
        member.setPhoneNumber(phoneNumber);
        //输出更新成功的提示信息
        System.out.println("会员"+member.getName()+"的手机号更新为："+phoneNumber);
    }
    //格式化日期时间的辅助方法
    //调用示例：formatDateTime(LocalDateTime.now())
    private static String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
    // 记录会员健身的方法
    public static void recordWorkout(String memberId, String equipment){
        Member member=members.get(memberId);
        //自动生成当前时间的字符串
        String date = formatDateTime(LocalDateTime.now());
        //生成一个健身记录加入用户的健身记录列表
        member.getWorkOutHistory().add(new WorkOutRecord(date, equipment));
        System.out.println("记录了"+member.getName()+"在"+date+"使用了"+equipment);
    }
    // 根据会员ID查看健身记录的方法
    public static void viewHistoryById(String memberId){
        Member member=members.get(memberId);
        if (member!=null) {
            for (WorkOutRecord record : member.getWorkOutHistory()) {
                System.out.println(record);
            }
        } else {
            System.out.println("没有找到这个会员");
        }
    }
    // 查看所有会员信息的方法
    public static void viewAllMember(){
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }
    // 统计会员数量的方法
    public static int countMember(){
        return members.size();
    }
    public static void main(String[] args) {
        //调用注册会员的方法
        registerMember("001","沈yb","18181818181");
        registerMember("002","张三","18181818182");
        //输出分隔线
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        //调用更新会员信息的方法
        updateMemberInfo("001", "沈yb", "18080808080");
        // 记录会员健身
        recordWorkout("001", "跑步机");
        recordWorkout("001", "杠铃卧推");
        recordWorkout("001", "负重深蹲");
        recordWorkout("002", "游泳馆");
        // 查看会员健身记录
        viewHistoryById("002");
    } 
    
   
    
    }

