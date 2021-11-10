import exceptions.WrongValueException;
import factories.ComputerFurnitureFactory;
import factories.ModernFurnitureFactory;

import java.util.Scanner;

public class main {
    private static void useFurnitures(Client client){
        client.sitOnClientChair();
        client.putComputerOnClientDesk();
        client.removeComputerFromClientDesk();
        client.removeComputerFromClientDesk();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose furniture: ");
        System.out.println("1 - Modern");
        System.out.println("2 - Computer");
        int choice = scan.nextInt();
        if(choice < 0 || choice > 3){
            throw new WrongValueException();
        }
        Client clientInstance;
        switch (choice){
            case 1 -> {
                clientInstance = new Client(new ModernFurnitureFactory());
                useFurnitures(clientInstance);
            }
            case 2 -> {
                clientInstance = new Client(new ComputerFurnitureFactory());
                useFurnitures(clientInstance);
            }
        }


    }
}
