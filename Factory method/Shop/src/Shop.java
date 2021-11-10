import java.util.Scanner;

public class Shop {

    private static Allegro chosenShop;

    private static void printSequence(float yourMoney){
        chosenShop.printWelcomeMessage();
        chosenShop.printCategory();
        IProduct product = chosenShop.getProductToOffer();
        System.out.println("Product name: " + product.getName());
        System.out.println("Product price: " + product.getPrice());
        System.out.println("Is available: " + product.isAvailable());
        System.out.println("Can you afford: " + product.canIAfford(yourMoney));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Pets");
        System.out.println("2 - Cars");
        System.out.println("3 - Computers");
        System.out.print("Type number of product you want to buy: ");
        int choice = -1;
        float customerMoney = 0;
        choice = scan.nextInt();
        if(choice < 1 || choice > 3){
            throw new WrongValueException();
        }
        System.out.print("Now type how much can you spend: ");
        customerMoney = scan.nextFloat();
        if(customerMoney < 0){
            throw new NoMoneyException();
        }

        switch (choice) {
            case 1 -> {
                chosenShop = new AllegroPets();
                printSequence(customerMoney);
            }
            case 2 -> {
                chosenShop = new AllegroCars();
                printSequence(customerMoney);
            }
            case 3 -> {
                chosenShop = new AllegroComputers();
                printSequence(customerMoney);
            }
        }
    }
}
