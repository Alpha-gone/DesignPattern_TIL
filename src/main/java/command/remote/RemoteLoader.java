package command.remote;

import command.command.*;
import command.command.ceilingfan.CeilingFanOffCommand;
import command.command.ceilingfan.CeilingFanOnCommand;
import command.command.light.LightOffCommand;
import command.command.light.LightOnCommand;
import command.reciver.CeilingFan;
import command.reciver.GarageDoor;
import command.reciver.Light;
import command.reciver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("주방");
        CeilingFan ceilingFan = new CeilingFan("거실");
        GarageDoor garageDoor = new GarageDoor("차고");
        Stereo stereo = new Stereo("거실");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        control.setCommand(1, kitchenLightOn, kitchenLightOff);
        control.setCommand(2, ceilingFanOn, ceilingFanOff);
        control.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(control);

        for (int i = 0; i < 4; i++){
            control.onButtonWasPushed(i);
            control.offButtonWasPushed(i);
        }
    }
}
