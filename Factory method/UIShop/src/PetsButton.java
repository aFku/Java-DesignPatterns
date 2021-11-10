import javax.swing.*;

public class PetsButton extends JButton implements IShopButton {
    private Allegro shop = new AllegroPets();

    public PetsButton(String name){
        super(name);
    }

    @Override
    public Allegro getShop(){
        return shop;
    }
}
