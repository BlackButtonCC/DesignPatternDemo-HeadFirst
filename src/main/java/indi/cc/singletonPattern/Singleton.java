package indi.cc.singletonPattern;

/**
 * Author : CharlesChen
 * Time : 2017-08-07 21:53
 * Version : 1.0
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton(){
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }

        return singleton;
    }

    /**
     * 单例的动作
     */
    public void action1() {

    }
}
