package EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandlingWithinClass extends Frame implements ActionListener {
    TextField textField;

    void meth() {
        //creating component
        textField = new TextField();

        // setting the postion and size
        textField.setBounds(100, 100, 100, 100);
        Button button = new Button("Click");
        button.setBounds(100, 200, 100, 100);
        BorderLayout bt = new BorderLayout();
// register source with listener
//  this refers to current instance
        button.addActionListener(this);
        add(textField);
        add(button);

        setSize(500, 500);
        setLayout(bt);
        setVisible(true);

    }

    // implementing method of action Listener
    @Override
    public void actionPerformed(ActionEvent e) {  
        textField.setText("Hello Brother");
    }

    public static void main(String[] args) {
        HandlingWithinClass n = new HandlingWithinClass();
        n.meth();
    }
}
