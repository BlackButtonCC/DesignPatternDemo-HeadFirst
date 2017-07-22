package indi.cc.observerPattern;

/**
 * Author : CharlesChen
 * Time : 2017-07-22 17:22
 * Version : 1.0
 */
public class Main {
    public static void main(String args[]) {
        WeatherData wd = new WeatherData();
        CurrentConditionDisplay ccd = new CurrentConditionDisplay();
        wd.addObserver(ccd);

        //wd.deleteObserver(ccd);     //删除后没有任何布告板接收消息
        wd.setParams(37, 44, 108);
        wd.setParams(38, 99, 110);


    }
}
