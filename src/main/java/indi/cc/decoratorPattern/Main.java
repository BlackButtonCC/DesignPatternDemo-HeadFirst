package indi.cc.decoratorPattern;

/**
 * 测试装饰模式用例。
 * Author : CharlesChen
 * Time : 2017-07-26 22:35
 * Version : 1.0
 */
public class Main {
    public static void main(String args[]) {
        AbstractDrink drink = new Espresso();
        drink = new Mocha(drink);
        drink = new Milk(drink);
        System.out.println(drink.getDescription() + "，花了" + drink.cost() + "块。请问微信还是支付宝？");
    }
}
