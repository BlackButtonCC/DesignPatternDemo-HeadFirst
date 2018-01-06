package indi.cc.proxyPattern;

import java.lang.reflect.Proxy;

/**
 * 代理模式：。个人理解是“过滤非法要求，转发合理要求”。
 * 在本用例中，实现一个约会服务系统，在服务中加入“Hot”和“Not”的评鉴。为了防止恶意刷分，引入了代理模式。
 * Author : CharlesChen
 * Time : 2018-01-04 14:18
 * Version : 1.0
 */
public class Main {
    public Main() {
        initDB();
    }

    public void initDB() {

    }

    public static void main(String args[]) {
        Main main = new Main();

    }

    public void drive() {
        PersonBean joe = getPersonFromDB();
    }

    public PersonBean getPersonFromDB() {
        return null;
    }

    public PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
}
