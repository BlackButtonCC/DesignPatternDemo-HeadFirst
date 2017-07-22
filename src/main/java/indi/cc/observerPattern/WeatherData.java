package indi.cc.observerPattern;

import java.util.HashMap;
import java.util.Observable;

/**
 * 《Head First 设计模式》的第二章中，天气布告版的实现。
 * Author : CharlesChen
 * Time : 2017-07-22 17:00
 * Version : 1.0
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementChanged() {
        setChanged();
        notifyObservers(getParams());
    }

    public HashMap<String, Float> getParams() {
        HashMap<String, Float> tmpMap = new HashMap<>(3);
        tmpMap.put("temperature", getTemperature());
        tmpMap.put("humidity",getHumidity());
        tmpMap.put("pressure", getPressure());

        return tmpMap;
    }

    public void setParams(float temperature, float humidity, float presure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = presure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
