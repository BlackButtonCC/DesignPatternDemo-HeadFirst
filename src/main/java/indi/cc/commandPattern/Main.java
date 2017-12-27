package indi.cc.commandPattern;

/**
 * 命令模式：重点是发出请求的对象与执行请求的对象是解耦的（当然可以耦合，但是这样就不能随意储存、传递和调用动作）
 * Author : CharlesChen
 * Time : 2017-08-07 22:01
 * Version : 1.0
 */
public class Main {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();
        //声明命令
        Light light = new Light("Kitchen");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        //设置命令
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        //测试命令
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
    }
}
