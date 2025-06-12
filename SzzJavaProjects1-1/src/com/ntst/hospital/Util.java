package com.ntst.hospital;

import java.util.Random;

public class Util {
	// 随机获取诊断结果
	public static String getDiag(String[] diagnosis) {
		// 创建一个随机数生成器
		Random random = new Random();
		// 从诊断结果数组中随机获取一个诊断结果
		String diag = diagnosis[random.nextInt(diagnosis.length)];
		// 返回随机获取的诊断结果
		return diag;
	}
	
	public static void main(String[] args) {
		// 定义诊断结果数组
		String[] diagnosis = {"感冒","高血压","高血糖","脑梗","肺炎","冠心病","严重发烧"};
		// 输出随机获取的诊断结果
		System.out.println(Util.getDiag(diagnosis));
	}
}
