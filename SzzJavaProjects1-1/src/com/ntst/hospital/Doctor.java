package com.ntst.hospital;

// 定义一个医生类
public class Doctor {
	// 定义医生姓名
	protected String name;
	// 定义医生所属科室
	protected String department;
	
	// 构造函数，初始化医生姓名和所属科室
	public Doctor(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	// 显示医生信息
	public void displayInfo() {
        System.out.println("姓名: " + name);
        System.out.println("所属科室: " + department);
    }
	
	// 为患者诊断
	public void treatPatient(Patient patient) {
		System.out.println(name+"正在为："+patient.getName()+"诊断");
	}

	
}
