package indi.cc.adaptorAndFacadePattern;

/**
 * 适配器模式：将一个类的接口，装换成客户期望的另一个接口。适配器让原本不兼容的类可以合作无间。
 * 外观模式：提供了一个统一的接口，用来访问子系统中一群接口。外观定义了一个高层接口，让子系统更容易使用。即定义了一个类似run()的函数，包含了很多其他的函数。
 * Author : CharlesChen
 * Time : 2017-08-17 19:58
 * Version : 1.0
 */
public class Main {
    public static void main(String args[]) {
        //测试适配器模式
        Duck turkeyAdaptor = new TurkeyAdaptor(new Turkey("嘿嘿嘿"));
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();

        //测试外观模式，算了，不用了。
    }
}
