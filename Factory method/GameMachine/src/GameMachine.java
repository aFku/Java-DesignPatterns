import games.IGame;
import loaders.Loader;

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
        System.out.println("\nGame started!\n");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("You opponent starts with " + game.getEnemyHealth() + " HP!");

        while (!game.isFinished()){
            System.out.println("Press enter to hit enemy");
            // You have to press Enter, if you pressed something else you will be asked to print only enter
            String hitKey = scanner.nextLine();
            while(true){
                if(hitKey.isEmpty()){
                    break;
                }else{
                    System.out.println("Please press only enter!");
                    hitKey = scanner.nextLine();
                }
            }
            TimeUnit.SECONDS.sleep(2);

            int healthBefore = game.getEnemyHealth();
            game.hitEnemy();
            System.out.println("You dealt " + Math.abs(healthBefore - game.getEnemyHealth()) + " to your opponent!");
            System.out.println("Now your opponent has only " + game.getEnemyHealth() + " HP!\n");
        }
        System.out.println("Congratulations! You finished " + game.getName());
    }

}
