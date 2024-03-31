package org.rcbg.afku;

import java.util.ArrayList;
import java.util.List;

public class General {

    private List<BaseCommand> executedCommandsHistory = new ArrayList<>();

    private BaseCommand command;

    public void setCommand(BaseCommand command){
        this.command = command;
    }

    public void executeCommand(){
        this.command.executeOrder();
        executedCommandsHistory.add(this.command);
    }

    public void listCommandHistory(){
        for(BaseCommand historicalCommand: this.executedCommandsHistory){
            System.out.println(historicalCommand.toString());
        }
    }
}
