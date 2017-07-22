package indi.cc.observerPattern;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * Author : CharlesChen
 * Time : 2017-07-22 17:18
 * Version : 1.0
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;

    /**
     *
     * @param observable 主题。判断时哪个主题给的消息，在多观察者情况下肯定会用到，不能卵更新消息。
     * @param o 消息参数。我用的一个map来弄的。
     */
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            HashMap<String, Float> paramsMap = (HashMap<String, Float>) o;
            this.temperature = paramsMap.get("temperature");
            this.humidity = paramsMap.get("humidity");
            display();
        }
    }

    public void display() {
        System.out.println("现在温度是：" + this.temperature + " 摄氏度，现在湿度是：" + this.humidity + " %");
    }
}
