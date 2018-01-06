package indi.cc.factoryPattern;

import java.util.ArrayList;

/**
 * 高层抽象Pizza
 * Author : CharlesChen
 * Time : 2018-01-06 19:22
 * Version : 1.0
 */
public abstract class Pizza {
    String name;
    String dough;       //面团类型
    String sauce;        //酱料类型
    ArrayList toppings = new ArrayList();       //顶层佐料类型

    public void prepare() {
        System.out.println("准备 " + name);
        System.out.println("抓面饼...");
        System.out.println("加酱料...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("在177℃下烤25分钟...");
    }

    public void cut() {
        System.out.println("切成扇形...");
    }

    public void box() {
        System.out.println("包装进漂亮的盒子里...");
    }

    public String getName() {
        return name;
    }
}
