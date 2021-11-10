import java.util.Scanner;
import exceptions.WrongValueException;
import loaders.Loader;

public class main {

    private static Scanner scan;

    public static void main(String[] args) throws InterruptedException {
        scan = new Scanner(System.in);
        System.out.println("Welcome to the GameMachine 2000!");
        System.out.println("Chose a game you want to play");
        System.out.println("1 - CallOfDuty");
        System.out.println("2 - StreetFighter");
        System.out.print("Type game number: ");
        int choice = -1;
        choice = scan.nextInt();
        if (choice < 1 || choice > 2) {
            throw new WrongValueException();
        }
        switch (choice) {
            case 1 -> {
                GameMachine gm = new GameMachine(scan, new Loader("CallOfDuty"));
                gm.playGame();
            }
            case 2 -> {
                GameMachine gm = new GameMachine(scan, new Loader("StreetFighter"));
                gm.playGame();
            }
        }
    }
}
