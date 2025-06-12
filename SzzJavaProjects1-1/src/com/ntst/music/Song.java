package com.ntst.music;

public class Song {
    private String title;
    private String artist;
    private String lyricist;
    private int releaseYear;
    private String album;
    public Song(String title, String artist, String lyricist, int releaseYear, String album) {
        this.title = title;
        this.artist = artist;
        this.lyricist = lyricist;
        this.releaseYear = releaseYear;
        this.album = album;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getLyricist() {
        return lyricist;
    }
    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    @Override
    public String toString() {
        return "Song [标题：" + title + ", 歌手：" + artist + ", 作词人：" + lyricist + ", 发行年代：" + releaseYear
                + ", album=" + album + "]";
    }
    
}
