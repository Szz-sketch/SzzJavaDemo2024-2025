package com.ntst.test;

import com.ntst.video.Movie;
import com.ntst.video.Video;
//沈彦彬
public class TestVideo {
    public static void main(String[] args) {
        //创建一个Movie对象，参数分别为电影名、时长、导演、类型
        Video movie = new Movie("熊出没·逆转时空", 108, "林汇达", "喜剧");
        //调用displayDetails方法，显示电影的详细信息
        movie.displayDetails();
        //输出分隔符
        System.out.println("~~~~~~~~~~~~~~沈彦彬审核后~~~~~~~~~~~~~~");
        //调用review方法，审核电影
        movie.review();
        //调用displayDetails方法，显示电影的详细信息
        movie.displayDetails();
    }
}
