package com.ntst.exception;

// 定义一个空调异常类，继承自DeviceException类
public class AirException extends DeviceException{
    // 构造方法，传入最低温度和最高温度
    public AirException(int min,int max) {
        // 调用父类的构造方法，传入异常信息
        super("友情提示：本空调最低温度："+min+"，最高温度："+max);
    }
}
