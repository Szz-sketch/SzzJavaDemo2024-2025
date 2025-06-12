package com.ntst.music;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SongLibrary {
    private HashSet<Song> songs = new HashSet<>();

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("添加" + song.getTitle() + "进入曲库成功");
    }
    //通过年份查询歌曲
    public List<Song> findSongsByYear(int year) {
        List<Song> resultList = new ArrayList<>();
        for (Song song : songs) {
            if (song.getReleaseYear()==year) {
                //如果代码进入到这里，说明这首歌的年份符合要求，我们要把它存起来
                resultList.add(song);
            }
        }
        return resultList;
    }
    public static void main(String[] args) {
        SongLibrary library = new SongLibrary();
        library.addSong(new Song("稻香", "周杰伦", "周杰伦", 2008, "魔杰座"));
        library.addSong(new Song("江南", "林俊杰", "林秋离", 2003, "乐行者"));
        library.addSong(new Song("青花瓷", "周杰伦", "方文山", 2007, "我很忙"));
        library.addSong(new Song("七里香", "周杰伦", "方文山", 2004, "七里香"));
        library.addSong(new Song("曹操", "林俊杰", "小克", 2006, "曹操"));
        library.addSong(new Song("她说", "林俊杰", "小克", 2009, "她说"));
        library.addSong(new Song("好久不见", "陈奕迅", "黄伟文", 2007, "不想放手"));
        library.addSong(new Song("红玫瑰", "陈奕迅", "林夕", 2004, "Rice & Shine"));
        library.addSong(new Song("小幸运", "田馥甄", "徐世珍", 2015, "我的少女时代电影原声带"));
        library.addSong(new Song("你就不要想起我", "田馥甄", "施人诚", 2010, "To Hebe"));
        library.addSong(new Song("日不落", "蔡依林", "姚若龙", 2006, "舞娘"));
        library.addSong(new Song("说爱你", "蔡依林", "李焯雄", 2003, "Myself"));
        library.addSong(new Song("浮夸", "陈奕迅", "黄伟文", 2004, "C&amp;E"));
        library.addSong(new Song("K歌之王", "陈奕迅", "林夕", 2000, "The Easy Ride"));
        library.addSong(new Song("爱情转移", "陈奕迅", "易家扬", 2005, "U87"));

        List<Song> list2004 = library.findSongsByYear(2004);
        System.out.println("2004年的歌曲有："+list2004);
    }
}
