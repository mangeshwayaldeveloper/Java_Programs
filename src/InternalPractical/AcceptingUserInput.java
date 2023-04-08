package InternalPractical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcceptingUserInput extends JFrame {
    public String n;
    public String c;
    public String ag;
    public String g;

    AcceptingUserInput() {
        JLabel l = new JLabel("Enter Your Name");
        TextField tx1 = new TextField();
        JLabel l2 = new JLabel("Enter Your Class");
        TextField tx2 = new TextField();
        JLabel l3 = new JLabel("age");
        TextField tx3 = new TextField();
        JLabel l4 = new JLabel("Gender");
        TextField tx4 = new TextField();

        Button bt = new Button("Submit");

        JLabel lb1 = new JLabel("");
        JLabel lb2 = new JLabel("");
        JLabel lb3 = new JLabel("");
        JLabel lb4 = new JLabel("");

        l.setBounds(20, 30, 160, 40);
        tx1.setBounds(20, 90, 160, 40);
        l2.setBounds(20, 150, 160, 40);
        tx2.setBounds(20, 200, 160, 40);
        l3.setBounds(20, 280, 160, 40);
        tx3.setBounds(20, 400, 160, 40);
        l4.setBounds(20, 530, 160, 40);
        tx4.setBounds(20, 600, 160, 40);
        bt.setBounds(20, 650, 160, 35);

        lb1.setBounds(20, 720, 60, 40);
        lb2.setBounds(20, 720, 60, 40);
        lb3.setBounds(20, 720, 60, 40);
        lb4.setBounds(20, 720, 60, 40);
        add(l);
        add(tx1);
        add(l2);
        add(tx2);
        add(l3);
        add(tx3);
        add(l4);
        add(tx4);
        add(bt);
        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);

        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tx1.getText();
                String cl = tx2.getText();
                String age = tx3.getText();
                String gender = tx4.getText();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangesh", "root", "");
                    PreparedStatement ps = con.prepareStatement("INSERT INTO mydb (name,class,age,gender) VALUES (? ? ? ?)");
                    ps.setString(1, name);
                    ps.setString(2, cl);
                    ps.setString(3, age);
                    ps.setString(4, gender);
                    ps.execute();
                    ResultSet rs = ps.getResultSet();
                    while (rs.next()) {
                        n = rs.getString(1);
                        c = rs.getString(2);
                        ag = rs.getString(3);
                        g = rs.getString(4);
                    }
                } catch (Exception exception) {
                }
                lb1.setText(n);
                lb2.setText(c);
                lb3.setText(ag);
                lb4.setText(g);
            }

        });
    }

    public static void main(String[] args) {
        AcceptingUserInput ac=new AcceptingUserInput();
    }
}
