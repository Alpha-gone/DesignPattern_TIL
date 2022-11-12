package command.remote;

import command.command.Command;
import command.command.NoCommand;

public class RemoteControl {
    private int slotCnt;
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(){
        slotCnt= 7;

        onCommands = new Command[slotCnt];
        offCommands = new Command[slotCnt];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slotCnt; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n------- 리모컨 ------\n");

        for (int i = 0; i < slotCnt; i++){
            sb.append("[slot " + i + "] " +
                    onCommands[i].getClass().getSimpleName()+ "\t" +
                    offCommands[i].getClass().getSimpleName() + "\n");
        }

        return sb.toString();
    }
}
