package indi.cc.templateMethodPattern;

import javax.swing.*;
import java.awt.*;

/**
 * 用了swing和awt的模板
 * Author : CharlesChen
 * Time : 2017-08-27 10:35
 * Version : 1.0
 */
public class MyFrame extends JFrame {
    public MyFrame(String s) throws HeadlessException {
        super(s);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawString("嘿嘿嘿", 100, 100);
    }

    public static void main(String args[]) {
        MyFrame myFrame = new MyFrame("随意，随意");
    }
}
