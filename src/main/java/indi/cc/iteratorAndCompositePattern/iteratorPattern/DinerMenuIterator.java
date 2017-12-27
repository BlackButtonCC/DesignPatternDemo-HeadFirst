package indi.cc.iteratorAndCompositePattern.iteratorPattern;

import java.util.Iterator;

/**
 * 晚餐菜单迭代器。注意：remove()的边界确认应该十分小心。
 * Author : CharlesChen
 * Time : 2017-08-29 22:27
 * Version : 1.0
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem tmp_menuItem = menuItems[position];
        position += 1;

        return tmp_menuItem;
    }

    @Override
    /**
     * 删除当前遍历项，直接使后面项覆盖前面项即可。
     */
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("无任何元素可移除");
        }
        for (int i = position - 1; i <= menuItems.length; i++) {
            menuItems[i] = menuItems[i+1];
        }
    }
}
