package indi.cc.iteratorAndCompositePattern.compositePattern;

/**
 * 菜单组件抽象类，所有的组件都必须继承该类（因为为了实现树结构）
 * Author : CharlesChen
 * Time : 2017-12-27 11:24
 * Version : 1.0
 */
public abstract class MenuComponent {
    //“组合”方法组织在一起，即新增、删除、取得菜单组件
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //“操作”，被菜单项使用
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    //打印“操作”
    public void print() {
        throw new UnsupportedOperationException();
    }

}
