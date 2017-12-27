package indi.cc.templateMethodPattern;

/**
 * Author : CharlesChen
 * Time : 2017-08-27 10:19
 * Version : 1.0
 */
public class Duck implements Comparable{
    public String name;
    public int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "姓名='" + name + '\'' +
                ", 重量=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
