import javax.swing.*;

public class ComputerButton extends JButton implements IShopButton {
    private Allegro shop = new AllegroComputers();

    public ComputerButton(String name){
        super(name);
    }

    @Override
    public Allegro getShop(){
        return shop;
    }
}
