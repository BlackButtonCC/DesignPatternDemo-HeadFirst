package indi.cc.CommandPattern;

/**
 * Author : CharlesChen
 * Time : 2017-08-17 19:25
 * Version : 1.0
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
