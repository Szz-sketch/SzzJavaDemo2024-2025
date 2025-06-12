package com.ntst.video;

public class TVShow extends Video {
    private int number;
    private String genre;

    public TVShow(String title, int duration, int number, String genre) {
        super(title, duration);
        this.number = number;
        this.genre = genre;
    }

    // 重写父类的审核方法
    @Override
    public void review() {
        if (number > 50) {
            this.status = "审核不通过";
        } else {
            this.status = "审核通过";
        }
    }

    // 可以添加获取剧集数的方法
    public int getNumber() {
        return number;
    }

    // 可以添加获取类型的方法
    public String getGenre() {
        return genre;
    }
}
