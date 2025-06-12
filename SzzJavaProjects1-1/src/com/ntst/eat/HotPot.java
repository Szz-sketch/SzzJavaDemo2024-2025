package com.ntst.eat;

public class HotPot {
	public static void main(String[] args) {
		// 顾客是否选择的是促销锅底”猪肚包鸡锅”
        boolean isRecommend = true;
        // 顾客点的食材数量
        int itemCount = 15;
        // 每份食材的价格
        int itemPrice = 10;
        // 锅底基础价格
        int basePrice = 50;
        // 额外优惠，如果点了超过10份食材且选择了”猪肚包鸡锅”
        int discount = 30;
        
        // 计算食材总价
        int itemsTotal = itemCount * itemPrice;
        // 计算是否有额外优惠
        int finalDiscount = (itemCount > 10 && isRecommend) ? discount : 0;
        // 计算最终价格
        int finalPrice = basePrice + itemsTotal - finalDiscount;
        // 赠送一份价值10元的小菜
        finalPrice -= 10;

        // 最终价格已经计算完成
        System.out.println("原价："+(basePrice + itemsTotal));
        System.out.println("活动后的价格："+finalPrice);
        System.out.println("沈彦彬");
	}
}
