import javax.swing.*;

public class CarButton extends JButton implements IShopButton{
    private Allegro shop = new AllegroCars();

    public CarButton(String name){
        super(name);
    }

    @Override
    public Allegro getShop(){
        return shop;
    }
}
