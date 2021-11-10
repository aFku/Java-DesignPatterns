public class AllegroPets extends Allegro{

    @Override
    public IProduct getProductToOffer() {
        return new Pet();
    }

    @Override
    public void printCategory(){
        System.out.println("You are now on AllegroPets");
    }

}
