package com.ntst.life;

public class Weibo {
    // 定义微博的属性
    private String username;
    private String content;
    private int likes;
    private int comments;
    
    // 无参构造方法，默认发布一条微博
    public Weibo() {
        this("沈zz","昨晚的烧烤真不错O(∩_∩)O");
    }

    // 有参构造方法，发布一条微博
    public Weibo(String username, String content) {
        this.username = username;
        this.content = content;
        this.likes = 0;
        this.comments = 0;
    }
    
    // 发布微博的方法
    public void postWeibo(){
        System.out.println(username+"发布了一条微博：");
        System.out.println(content);
        System.out.println("点赞数："+likes);
        System.out.println("评论数："+comments);
    }

    // 点赞的方法
    public void like(){
        this.likes++;
        System.out.println(username+"的微博被点赞了，当前点赞数"+this.likes);
    }
    
    // 重写toString方法，返回微博的属性
    @Override
    public String toString() {
        return "Weibo [username=" + username + ", content=" + content + ", likes=" + likes + ", comments=" + comments
                + "]";
    }
	public static void main(String[] args) {
		// 创建一个微博对象
		Weibo weibo2 = new Weibo();
        // 发布微博
        weibo2.postWeibo();
		// 点赞微博
		weibo2.like();
		weibo2.like();
		weibo2.like();
        // 输出沈彦彬
        System.out.println("沈彦彬");
	}   
}
