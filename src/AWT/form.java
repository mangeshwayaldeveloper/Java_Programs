package AWT;

import java.awt.*;

class AWTForm extends Frame {
    AWTForm() {
        //creating a button
        Button b = new Button("Click Me");
        // setting position on screen
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(500, 500);
        setTitle("This is our basic AWT example");
        setLayout(null);
        setVisible(true);
    }
}

public class form {
    public static void main(String[] args) {
        AWTForm awt = new AWTForm();
    }
}
