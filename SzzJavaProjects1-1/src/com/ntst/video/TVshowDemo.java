package com.ntst.video;

public class TVshowDemo extends Video{
   // 定义剧集数和类型
   private int number;
   private String genre;
// 构造方法，传入标题、时长、剧集数和类型
public TVshowDemo(String title, int duration, int number, String genre) {
	super(title, duration);
	this.number = number;
	this.genre = genre;
}
// 审核方法，判断剧集数是否大于50，大于则未通过，小于则通过
public void review() {
	System.out.println("正在审核电影："+title);
	if (genre.equals("剧集数>50")) {
		status = "未通过";
		System.out.println("剧集数<=50");
	}else {
		status = "审核通过";
		System.out.println("电影"+title+"审核通过");
	}
}
// 重写displayDetails方法，显示剧集数和类型
@Override
public void displayDetails() {
	
	super.displayDetails();
	System.out.println("剧集数："+number);
    System.out.println("类型："+genre);
}
 
}
