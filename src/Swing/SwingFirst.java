package Swing;

import javax.swing.*;

public class SwingFirst extends JFrame {
    JFrame f;

    SwingFirst() {
        JButton b = new JButton("Click");  //creating button
        b.setBounds(130, 100, 100, 40);

        JLabel jl = new JLabel("label");
        jl.setBounds(30, 30, 30, 30);
        JTextField jt = new JTextField("Enter Your name");
        jt.setBounds(130,200,120,130);
        add(jt);
        add(jl);
        add(b); // add button to frame
        setSize(400, 400);   // setting size
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingFirst f = new SwingFirst();
    }

}
