import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog extends JFrame implements ActionListener {
    private Allegro chosenShop;
    private JSpinner spinner;

    public Dialog(){
        super("Allegro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocation(0, 0);
        JLabel spinnerLabel = new JLabel();
        spinnerLabel.setText("Your money: ");
        add(spinnerLabel);
        SpinnerModel numberModel = new SpinnerNumberModel(new Float(0.0), new Float(0.0f), new Float(500.0f),new Float(0.5f));
        spinner = new JSpinner(numberModel);
        add(spinner);
        JButton carB = new CarButton("Cars");
        carB.addActionListener(this);
        JButton petB = new PetsButton("Pets");
        petB.addActionListener(this);
        JButton computerB = new ComputerButton("Computers");
        computerB.addActionListener(this);
        setLayout(new FlowLayout());

        add(carB);
        add(petB);
        add(computerB);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if(source instanceof IShopButton){
            chosenShop = ((IShopButton) source).getShop();
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new ProductFrame(chosenShop.getProductToOffer(), (float)spinner.getValue());
                }
            });
        }
    }


}
