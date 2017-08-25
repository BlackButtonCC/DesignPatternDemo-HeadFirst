package indi.cc.commandPattern;

/**
 * Author : CharlesChen
 * Time : 2017-08-17 19:39
 * Version : 1.0
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
