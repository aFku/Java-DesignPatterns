package Loaders;

import Games.IGame;
import Games.StreetFighter;

public class StreetFighterLoader extends Loader{

    public StreetFighterLoader(){
        loaderName = "StreetFighter";
        loaderVersion = 2.0;
    }

    public IGame loadGame(){
        printStartLoading();
        IGame game = new StreetFighter();
        printEndLoading();
        return game;
    }
}
