package indi.cc.templateMethodPattern;

import java.util.Arrays;

/**
 * 模板方法模式：在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法是的子类可以在不改变算法的结构的情况下，重新定义算法中的某些步骤。
 * Author : CharlesChen
 * Time : 2017-08-25 20:30
 * Version : 1.0
 */
public class Main {
    public static void main(String args[]) {
        Duck[] ducks = {
                new Duck("A", 8),
                new Duck("B", 2),
                new Duck("C", 7),
                new Duck("D", 10)
        };

        System.out.println("排序前:");
        displayDucks(ducks);

        Arrays.sort(ducks);

        System.out.println("排序后:");
        displayDucks(ducks);
    }

    public static void displayDucks(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck.toString());
        }
    }
}
