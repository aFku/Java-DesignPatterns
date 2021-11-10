public class Pet implements IProduct{
    /*
    Class that should be one of the product and implements IProduct interface
     */

    private final float price = 5.0f;
    private final String name = "Pet";

    @Override
    public float getPrice() {
        return this.price; // Without VAT
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public Boolean isAvailable(){
        return false;
    }

    @Override
    public Boolean canIAfford(float myMoney){
        return myMoney - this.price > 0;
    }
}
