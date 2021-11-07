public class AllegroComputers extends Allegro{

    @Override
    public IProduct getProductToOffer() {
        return new Computer();
    }

    @Override
    public void printCategory(){
        System.out.println("You are now on AllegroComputers");
    }
}
