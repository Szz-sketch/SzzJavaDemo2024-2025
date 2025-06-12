package com.ntst.video;

// 定义一个Movie类，继承自Video类
public class Movie extends Video{
    // 定义导演和类型属性
    private String director;
    private String genre;
    // 构造方法，传入标题、时长、导演和类型
    public Movie(String title, int duration, String director, String genre) {
        super(title, duration);
        this.director = director;
        this.genre = genre;
    }
    // 重写review方法，审核电影
    @Override
    public void review() {
        System.out.println("正在审核电影"+title);
        // 如果类型为恐怖片，审核未通过
        if (genre.equals("恐怖片")) {
            status="未通过审核";
            System.out.println("电影"+title+"因为过于恐怖，审核未通过");     
        } else {
            // 否则审核通过
            status="已通过审核";
            System.out.println("电影"+title+"通过审核");
        }  
    }
    // 重写displayDetails方法，显示电影的详细信息
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("导演："+director);
        System.out.println("类型："+genre);
    }
}
