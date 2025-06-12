package com.ntst.hospital;

public class Patient {
	//患者姓名
	private String name;
	//诊断结果
	private String diagnosis;
	
	//构造方法，用于初始化患者姓名
	public Patient(String name) {
		this.name = name;
	}

	//获取患者姓名
	public String getName() {
		return name;
	}

	//设置患者姓名
	public void setName(String name) {
		this.name = name;
	}

	//获取诊断结果
	public String getDiagnosis() {
		return diagnosis;
	}

	//设置诊断结果
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	//显示患者信息
	public void displayInfo() {
        System.out.println("姓名: " + name);
        System.out.println("诊断: " + diagnosis);
    }

	
	
}
