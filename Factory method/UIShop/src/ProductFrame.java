import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductFrame extends JFrame implements ActionListener {
    private JButton exitButton;

    public ProductFrame(IProduct product, float myMoney){
        super("Product window (" + product.getName() + ")");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 600);
        setLocation(0, 0);
        setLayout(new FlowLayout());

        JLabel nameText = new JLabel();
        nameText.setText("Name: " + product.getName());
        add(nameText);
        JLabel priceText = new JLabel();
        priceText.setText("Price: " + product.getPrice());
        add(priceText);
        JLabel availabilityText = new JLabel();
        availabilityText.setText("Availability: " + product.isAvailable());
        add(availabilityText);
        JLabel affordableText = new JLabel();
        affordableText.setText("Can you afford: " + product.canIAfford(myMoney));
        add(affordableText);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        add(exitButton);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if(source == exitButton){
            this.dispose();
        }
    }
}
