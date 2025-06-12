package com.ntst.monitor;

import java.util.Random;

public class ICUMonitor {
    private static int heartRates;//60~100
    private static int bloodPressure;//90~140
    private static int oxygenLevel;//95%~100%

    //生成生命体征数据
    public static void generateLifeSign(){
        Random random=new Random();
        heartRates=random.nextInt(140)+20;
        bloodPressure=random.nextInt(120)+60;
        oxygenLevel=random.nextInt(10)+89;
    }
    //检查心率是否正常
    public static void checkHeartRate() {
        if(heartRates<60 || heartRates>100){
            throw new IllegalArgumentException("心率异常"+heartRates+"bmp");
        }
        System.out.println("心率正常"+heartRates+"bmp");
    }
    //检查血压是否正常
    public static void checkBloodPressure() {
        if(bloodPressure<90 || bloodPressure>140){
            throw new IllegalArgumentException("血压异常"+bloodPressure+"mmhg");
        }
        System.out.println("血压正常"+bloodPressure+"mmhg");
    }
    //检查血氧是否正常
    public static void checkOxygenLevel() {
        if(oxygenLevel<95){
            throw new IllegalArgumentException("血氧异常"+oxygenLevel+"%");
        }
        System.out.println("血氧正常"+oxygenLevel+"%");
    }
    //监测生命体征
    public static void monitorHealth(){
        while (true) {
            generateLifeSign();
            System.out.println("监测到新数据");
            try {
                checkHeartRate();
                checkBloodPressure();
                checkOxygenLevel();
                System.out.println("所有生命体征正常");    
            } catch (IllegalArgumentException e) {
                //主动抛出的异常
                System.err.println("警告："+e.getMessage());
                System.out.println("沈彦彬说请通知所有医护人员");
            } catch (Exception e) {
                //发生未知异常
                System.err.println("发生未知错误："+e.getMessage());
            }finally{
                System.out.println("~~~~~~~~~~~~~~~~~~~~~"); 
            }

            try {
                //非运行时异常
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }  
        }
    }
    public static void main(String[] args) {
        monitorHealth();
    }
}
