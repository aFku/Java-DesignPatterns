public class AllegroCars extends Allegro{

    @Override
    public IProduct getProductToOffer() {
        return new Car();
    }

    @Override
    public void printCategory(){
        System.out.println("You are now on AllegroCars");
    }
}
