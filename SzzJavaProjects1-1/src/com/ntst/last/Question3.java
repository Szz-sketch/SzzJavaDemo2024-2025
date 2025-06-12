package com.ntst.last; // 定义包名

public class Question3 { // 定义主类Question3
    public class Member { // 定义内部类Member，表示会员
        protected String name; // 会员姓名
        protected String membershipType; // 会员类型
        protected double sessionFee; // 每次会费

        // 构造函数，初始化会员信息
        public Member(String name, String membershipType, double sessionFee) {
            this.name = name; // 初始化会员姓名
            this.membershipType = membershipType; // 初始化会员类型
            this.sessionFee = sessionFee; // 初始化每次会费
        }

        // 计算年收入的 方法
        public double annualIncome() {
            return sessionFee * 24; // 每次会费乘以一年中的会次数（假设一年24次）
        }
    }

    public class PremiumMember extends Member { // 定义内部类PremiumMember，继承自Member，表示高级会员
        private String personalTrainer; // 个人教练

        // 构造函数，初始化高级会员信息
        public PremiumMember(String name, String membershipType, double sessionFee, String personalTrainer) {
            super(name, membershipType, sessionFee); // 调用父类构造函数初始化基本会员信息
            this.personalTrainer = personalTrainer; // 初始化个人教练
        }

        // 重写年收入的计算方法
        @Override
        public double annualIncome() {
            return super.annualIncome() * 1.5; // 调用父类方法计算年收入，并乘以1.5作为高级会员的额外收入
        }
    }

    public static void main(String[] args) { // 主方法，程序的入口
        Question3 question3 = new Question3(); // 创建Question3类的实例
        Member member = question3.new Member("张三", "普通会员", 50.0); // 创建普通会员实例
        // 打印普通会员的年收入
        System.out.printf("健身房从普通会员 %s 处一年获得的总收入: %.2f 元\n", member.name, member.annualIncome());

        PremiumMember premiumMember = question3.new PremiumMember("李四", "高级会员", 80.0, "王教练"); // 创建高级会员实例
        // 打印高级会员的年收入
        System.out.printf("健身房从高级会员 %s 处一年获得的总收入: %.2f 元\n", premiumMember.name, premiumMember.annualIncome());
    }
}
