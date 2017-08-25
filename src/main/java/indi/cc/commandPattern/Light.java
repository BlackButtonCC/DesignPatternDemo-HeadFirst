package indi.cc.commandPattern;

/**
 * Author : CharlesChen
 * Time : 2017-08-17 19:28
 * Version : 1.0
 */
public class Light {
    private String type;

    public Light(String type){
        switch (type) {
            case "Kitchen":
                this.type = "Kitchen";
                break;
            default:
                System.out.println("灯具类型声明错误");
                System.exit(1);
        }
    }

    public void on() {
        System.out.println(this.type + "开灯咯！");
    }

    public void off() {
        System.out.println(this.type + "关灯咯！");
    }

    public String getType() {
        return type;
    }
}
