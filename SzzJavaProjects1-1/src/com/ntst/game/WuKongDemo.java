package com.ntst.game;

public class WuKongDemo {
    public static void main(String[] args) {
        long hp = 123240L; 
        int attackPower = 200; 
        int defensePower = 150; 
        float speed = 5.5f; 
        float jumpPower = 10.0f; 
        int skillCooldown = 5; 
        int experiencePoints = 5000; 
        int level = 10; 
        char category = '猴';
        // 常量
        final long MAX_HP = 150000L; 
        final String SKILL_NAME = "金箍棒"; 
        //沈彦彬  syb   syb   syb   syb   syb   syb   syb
        System.out.println("悟空的属性:");
        System.out.println("血条: " + hp);
        System.out.println("攻击力: " + attackPower);
        System.out.println("防御力: " + defensePower);
        System.out.println("速度: " + speed);
        System.out.println("跳跃力: " + jumpPower);
        System.out.println("技能冷却时间: " + skillCooldown + "秒");
        System.out.println("经验值: " + experiencePoints);
        System.out.println("等级: " + level);
        System.out.println("最大血条: " + MAX_HP);
        System.out.println("技能名称: " + SKILL_NAME);
        System.out.println("品种: " + category);    
    }
    
    
}
