package com.ntst.exception;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeSystem{
    private int temperature=22;
    private final int MAX_TEMPERATURE=35;
    private final int MIN_TEMPERATURE=16;

    private List<String> copyRightedSongs;

    public SmartHomeSystem(){
        copyRightedSongs = new ArrayList<>();
        copyRightedSongs.add("青花瓷");
        copyRightedSongs.add("稻香");
        copyRightedSongs.add("晴天");
        copyRightedSongs.add("夜曲");
        copyRightedSongs.add("七里香");
        copyRightedSongs.add("告白气球");
        copyRightedSongs.add("海阔天空");
        copyRightedSongs.add("演员");
    }
    private void playSong(String songName) throws NoCopyRightException{
        if (!copyRightedSongs.contains(songName)) {
            throw new NoCopyRightException(songName); 
        }
        System.out.println("正在播放:"+songName);
    }
    
    public void setTemperature(int temperature) {
        if (temperature<MIN_TEMPERATURE || temperature>MAX_TEMPERATURE) {
            try {
                throw new AirException(MIN_TEMPERATURE,MAX_TEMPERATURE);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        this.temperature = temperature;
        System.out.println("温度已设置为"+this.temperature);
    }
    public static void main(String[] args) {
        SmartHomeSystem xiaoai = new SmartHomeSystem();
        xiaoai.setTemperature(30);
        try {
            xiaoai.playSong("我和我的祖国");
        } catch (NoCopyRightException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            System.out.println("沈彦彬");
        }
    }
}
