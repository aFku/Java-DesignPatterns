package Loaders;

import Games.CallOfDuty;
import Games.IGame;

public class CallOfDutyLoader extends Loader{

    public CallOfDutyLoader(){
        loaderName = "CallOfDutyLoader";
        loaderVersion = 1.3;
    }

    public IGame loadGame(){
        printStartLoading();
        IGame game = new CallOfDuty();
        printEndLoading();
        return game;
    }
}
