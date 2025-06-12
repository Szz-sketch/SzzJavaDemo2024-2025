package com.ntst.life;

public class Music {
	// 主方法
	public static void main(String[] args) {
		// 定义电池电量
		int battaryLevel=200;
		// 定义播放次数
		int playCount=1;
		
		// 当电池电量大于0时，循环播放歌单
		while(battaryLevel>0) {
			// 输出正在播放第几次歌单
			System.out.println("正在第"+playCount+"次播放您的歌单");
			// 每次播放减少20电量
			battaryLevel-=20;
			// 每次播放增加一次播放次数
			playCount++;
		}
		// 输出没电了，停止播放，并输出总共播放的次数
		System.out.println("没电了，停止播放。总共播放了"+(playCount+1)+"次");
		// 输出作者名字
		System.out.println("沈彦彬");
		
		
		
	}
}
