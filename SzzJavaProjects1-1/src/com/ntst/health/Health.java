package com.ntst.health;

public class Health {
	public static void main(String[] args) {
		// 写死的数据
        double heightCm = 175.0;  // 身高（厘米）
        double weightKg = 70.0;   // 体重（千克）

        // 将身高从厘米转换为米
        double heightM = heightCm / 100.0;

        // 计算BMI
        double bmi = weightKg / (heightM * heightM);

        // 使用关系运算符判断BMI范围
        boolean isUnderweight = (bmi < 18.5);
        boolean isNormal = (bmi >= 18.5) && (bmi < 24.9);
        boolean isOverweight = (bmi >= 25) && (bmi < 29.9);
        boolean isObese = (bmi >= 30);

        // 输出结果
        System.out.println("您的身高是: " + heightCm + " 厘米");
        System.out.println("您的体重是: " + weightKg + " 千克");
        System.out.println("您的BMI是: " + bmi);

        System.out.println("是否体重过轻: " + isUnderweight);
        System.out.println("是否体重正常: " + isNormal);
        System.out.println("是否超重: " + isOverweight);
        System.out.println("是否肥胖: " + isObese);
	}
}
