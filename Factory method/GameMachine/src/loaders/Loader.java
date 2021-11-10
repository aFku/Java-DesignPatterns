package loaders;

import games.CallOfDuty;
import games.IGame;
import games.StreetFighter;

public class Loader {
    /*
    * Changed Factory method loaders into one Simple Factory
    * You have to chose which game will be loaded by this loader filling constructor argument
    */
    private final String loaderName = "GameLoader";
    private final double loaderVersion = 1.0;

    private final IGame gameToLoad;

    public Loader(String gameName){
        switch (gameName){
            case "CallOfDuty" ->{
                gameToLoad = new CallOfDuty();
            }
            case "StreetFighter"-> {
                gameToLoad = new StreetFighter();
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }

    public void printLoaderWelcomeMessage(){
        System.out.println("Initialization of " + loaderName
                + " version: v" + loaderVersion + ". Welcome.");
    }

    public IGame loadGame(){
        System.out.println(gameToLoad.getName() + " will be loaded!");
        printStartLoading();
        printEndLoading();
        return gameToLoad;
    }

    protected void printStartLoading(){
        System.out.println("Loading started...");
    }

    protected void printEndLoading(){
        System.out.println("Loading finished...");
    }

}
