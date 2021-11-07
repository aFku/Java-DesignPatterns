package Loaders;

import Games.IGame;

public abstract class Loader {
    protected String loaderName;
    protected double loaderVersion;

    public void printLoaderWelcomeMessage(){
        System.out.println("Initialization of " + loaderName
                + " version: v" + loaderVersion + ". Welcome.");
    }

    public abstract IGame loadGame();

    protected void printStartLoading(){
        System.out.println("Loading started...");
    }

    protected void printEndLoading(){
        System.out.println("Loading finished...");
    }

}
