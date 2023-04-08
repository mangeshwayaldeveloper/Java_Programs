package AWT;

import java.awt.*;

public class SimpleAWTPractise extends Frame {
    SimpleAWTPractise() {
        //creating button
        Button b = new Button("Click Me");
        TextField tx=new TextField("wegou");


        //setting button position on screen
        b.setBounds(40, 100, 70, 80);
        tx.setBounds(100,100,40,50);
        // adding button to frame
        add(b);
        add(tx);

        setSize(400, 400);
        setTitle("This is my practise page");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleAWTPractise n = new SimpleAWTPractise();
    }
}
