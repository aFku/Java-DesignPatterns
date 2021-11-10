public class Computer implements IProduct{
    /*
    Class that should be one of the product and implements IProduct interface
     */

    private final float price = 250.0f;
    private final String name = "Computer";

    @Override
    public float getPrice() {
        return this.price * 1.23f; // 23% VAT
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public Boolean isAvailable(){
        return true;
    }

    @Override
    public Boolean canIAfford(float myMoney){
        return myMoney - this.price > 0;
    }
}
