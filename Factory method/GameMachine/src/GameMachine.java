import Games.IGame;
import Loaders.Loader;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GameMachine {

    private final Scanner scanner;
    private final Loader gameLoader;

    public GameMachine(Scanner input, Loader loader){
        scanner = input;
        gameLoader = loader;
    }

    public void playGame() throws InterruptedException {
        gameLoader.printLoaderWelcomeMessage();
        IGame game = gameLoader.loadGame();
        System.out.println("Game info:");
        System.out.println("-Name: " + game.getName());
        System.out.println("-Category: " + game.getCategory());
        System.out.println("-Age Limit: " + game.getAgeLimitation());
        System.out.println("");
        System.out.println("Game started!");
        System.out.println("");
        TimeUnit.SECONDS.sleep(1);

        int healthBefore;

        System.out.println("You opponent starts with " + game.getEnemyHealth() + " HP!");

        while (!game.isFinished()){
            System.out.println("Type enter to hit enemy");
            scanner.nextLine();
            TimeUnit.SECONDS.sleep(2);

            healthBefore = game.getEnemyHealth();
            game.hitEnemy();
            System.out.println("You dealt " + Math.abs(healthBefore - game.getEnemyHealth()) + " to your opponent!");
            System.out.println("Now your opponent has only " + game.getEnemyHealth() + " HP!");
            System.out.println("");
        }
        System.out.println("Congratulations! You finished " + game.getName());
    }

}
