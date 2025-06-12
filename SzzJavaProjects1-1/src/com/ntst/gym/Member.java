package com.ntst.gym; // 定义包名，表示该类属于com.ntst.gym包

import java.util.ArrayList; // 导入ArrayList类，用于存储列表数据
import java.util.List; // 导入List接口，用于表示列表

public class Member { // 定义一个名为Member的公共类
    private String memberId; // 私有成员变量，用于存储会员ID
    private String name; // 私有成员变量，用于存储会员姓名
    private String phoneNumber; // 私有成员变量，用于存储会员电话号码

    private List<WorkOutRecord> workOutHistory= new ArrayList<>(); // 私有成员变量，用于存储会员的锻炼历史记录，初始化为空列表

    // 构造方法，用于创建Member对象并初始化成员变量
    public Member(String memberId, String name, String phoneNumber) {
        this.memberId = memberId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<WorkOutRecord> getWorkOutHistory() {
        return workOutHistory;
    }

    public void setWorkOutHistory(List<WorkOutRecord> workOutHistory) {
        this.workOutHistory = workOutHistory;
    }

    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", workOutHistory="
                + workOutHistory + "]";
    }
    
    
}


