package indi.cc.factoryPattern;

 /**
  * 芝加哥芝士披萨
 * Author : CharlesChen
 * Time : 2018-01-06 19:41
 * Version : 1.0
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "芝加哥芝士披萨";
        dough = "厚饼";
        sauce = "小番茄酱";
        
        toppings.add("意大利白干奶酪");
    }

    @Override
    public void cut() {
        System.out.println("切成正方形...");
    }
}
