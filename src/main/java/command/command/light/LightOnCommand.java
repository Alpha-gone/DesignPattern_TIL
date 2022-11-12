package command.command.light;

import command.command.Command;
import command.reciver.Light;

public class LightOnCommand implements Command {
    private Light light;


    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
