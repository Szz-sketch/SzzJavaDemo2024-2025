package com.ntst.exception;

public class NoCopyRightException extends DeviceException{
    public NoCopyRightException(String songName) {
        super("抱歉，您生成的歌曲"+songName+"没有版权，无法播放！");
    }
    
}
