package AWT;

import java.awt.*;

public class AWTByInheritance extends Frame {
    AWTByInheritance(){
        //creating button
        Button b=new Button("Click Me");
        //setting button position on screen
        b.setBounds(40,100,90,40);

        // adding button into frame
        add(b);

        // frame size 300 width and 300 height
        setSize(300,300);
        //setting title of the frame
        setTitle("This is my first AWT");

        // no layout manger
        setLayout(null);

        //now fram will be visible, by deafault is not visible
        setVisible(true);
    }

    public static void main(String[] args) {
        AWTByInheritance awt=new AWTByInheritance();
    }

}
