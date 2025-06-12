package com.ntst.health;

public class Suggest {
    //沈彦彬
	public static void main(String[] args) {
        int age = 26;  // 用户年龄
        double weight = 75.0;  // 用户体重（单位：千克）
        boolean smokes = false;  // 用户是否吸烟
        boolean exercisesRegularly = true;  // 用户是否定期锻炼
        boolean eatsHealthy = true;  // 用户是否饮食健康

        // 使用逻辑运算符判断健康建议条件
        boolean shouldIncreaseActivity = age >= 18 && weight > 80.0 && !exercisesRegularly;
        boolean shouldQuitSmoking = smokes && age >= 18;
        boolean shouldImproveDiet = !eatsHealthy && age >= 18;
        boolean shouldMaintainCurrentLifestyle = exercisesRegularly && eatsHealthy && !smokes && weight <= 80.0;

        // 输出结果

        System.out.println("是否需要增加活动量: " + shouldIncreaseActivity);
        System.out.println("是否需要戒烟: " + shouldQuitSmoking);
        System.out.println("是否需要改善饮食: " + shouldImproveDiet);
        System.out.println("是否保持当前生活方式: " + shouldMaintainCurrentLifestyle);
        System.out.println("沈彦彬");
    
    }

}
