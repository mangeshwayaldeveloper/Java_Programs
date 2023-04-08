package InternalPractical;

import javax.swing.*;
import java.awt.*;

public class DollarToINR extends JFrame {
    private JLabel headingLabel, costLabel, resultLabel;
    private JTextField textField;
    private JComboBox<String> currencyCombo;
    private JButton convertButton;
    private String[] curriencies = {"USD", "EUR", "GBP", "INR", "CAD"};
    private double[] exchangeRate = {1.0, 1.22, 1.39, 0.0014, 0.79};

    public DollarToINR() {
        super("Currency Converter");
        setLayout(new GridLayout(4, 2));
        headingLabel = new JLabel("Convert cost from other currencies to USD", SwingConstants.CENTER);
        add(headingLabel);


    }
}
//class  abhg extends DollarToINR
//    DollarToINR() {
//        JLabel lb = new JLabel("Enter User Input");
//        JTextField tx = new JTextField();
//        Sele
//    }
//
//}
