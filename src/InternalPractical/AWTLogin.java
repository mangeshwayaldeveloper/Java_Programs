package InternalPractical;

import java.awt.*;

public class AWTLogin extends Frame {
    AWTLogin() {
        Label l= new Label("User Name");
        TextField tx = new TextField();
        Button bt = new Button("Submit");

        Label l2 = new Label("Password");
        TextField tx2 = new TextField();

        l.setBounds(20, 30, 100, 30);
        tx.setBounds(20, 60, 100, 30);
        l2.setBounds(20, 100, 100, 30);
        tx2.setBounds(20, 160, 100, 30);


        add(tx);
        add(l);
        add(l2);
        add(tx2);

        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        AWTLogin awt = new AWTLogin();
    }
}
