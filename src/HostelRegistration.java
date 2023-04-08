import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class HostelRegistration extends JFrame {
    HostelRegistration() {
        JLabel lb = new JLabel("Ashis");
        JTextField tx = new JTextField();
        JButton b = new JButton("submit");
        setTitle("The Boyzzzzz.");
        JLabel kj = new JLabel("");


        // setting bounds
        lb.setBounds(30, 40, 80, 50);
        tx.setBounds(30, 150, 80, 20);
        b.setBounds(30, 100, 90, 20);
        kj.setBounds(30,300,90,80);

        //addin ginto the frame
        add(lb);
        add(tx);
        add(b);
        add(kj);


        // set frame size and visibility
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = tx.getText();
//                kj.setText("Congrats baby");
//                kj.setText(n);
                try{
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mangesh","root","");
                    Statement st=con.createStatement();

                    PreparedStatement ps=con.prepareStatement("INSERT INTO mydb (name) VALUES (?) ");
                    ps.setString(1,n);
                    ps.executeUpdate();

                    ResultSet rs=st.executeQuery("SELECT * FROM mydb");
                    while(rs.next()){
                        String ns=rs.getString("name");
                        System.out.println(ns);
                        kj.setText(ns);
                    }
                }catch (Exception et){
                }
            }
        });


    }

    public static void main(String[] args) {
        HostelRegistration ht = new HostelRegistration();
    }
}
