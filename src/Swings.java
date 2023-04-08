import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Swings extends JFrame {
    private String firstN;
    private String lastN;

    Swings() {
        // lable for name
        JLabel label = new JLabel("First Name");
        JLabel lastName = new JLabel("Last Name");
        //  input name
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        // button
        JButton bt = new JButton("Submit");
        //adding into the frame
        //1. adding label
        add(label);
        add(lastName);
        add(bt);
        //2. adding textfield
        add(t1);
        add(t2);


        // set bound
        label.setBounds(49, 5, 102, 45);
        t1.setBounds(49, 35, 150, 30);

        lastName.setBounds(49, 60, 102, 45);
        t2.setBounds(49, 100, 150, 30);
        bt.setBounds(49, 150, 120, 30);


        // for frame
        setSize(400, 500);
        setLayout(null);
        setVisible(true);

        //setting Event Listner

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstN = t1.getText();
                lastN = t2.getText();

                // JDBC -- creating database connetivity
                String url = "jdbc:mysql://localhost:3306/mangesh";
                String uname = "root";
                String pass = "";
                try {
                    Connection con = DriverManager.getConnection(url, uname, pass);
                    PreparedStatement ist = con.prepareStatement("INSERT INTO mydb (firstname,lastname) VALUES(?,?)");
                    Statement st = con.createStatement();
                    ist.setString(1, firstN);
                    ist.setString(2, lastN);
                    ist.executeUpdate();

                    ResultSet rs = st.executeQuery("SELECT * FROM mydb");
                    while (rs.next()) {
                        String col1Value = rs.getString("firstname");
                        String col2Value = rs.getString("lastname");
                        System.out.println(col1Value);
                        System.out.println(col2Value);
                    }
                } catch (Exception et) {
                    et.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) {
        Swings s = new Swings();
    }
}
