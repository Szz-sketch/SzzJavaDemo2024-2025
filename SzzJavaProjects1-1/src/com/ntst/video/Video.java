package com.ntst.video;

// 定义一个抽象类Video
public abstract class Video {
    // 定义视频的标题、时长和状态
    protected String title;
    protected int duration;
    protected String status;
    // 构造方法，初始化视频的标题、时长和状态
    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
        this.status = "未审核";
    }
 // 定义菜单和对应的价格及选项
public void displayDetails() {
    // 打印标题、时长和状态信息
    System.out.println("标题：" + title + "，时长：" + duration + "秒，状态：" + status);
}
// 定义一个抽象方法review，用于审核视频
public abstract void review();
}
