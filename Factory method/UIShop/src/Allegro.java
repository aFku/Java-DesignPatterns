public abstract class Allegro {
    private String shopName = "Allegro";

    public void printWelcomeMessage(){
        System.out.println("Welcome to the " + this.shopName);
    }

    public abstract IProduct getProductToOffer();
    public abstract void printCategory();
}
