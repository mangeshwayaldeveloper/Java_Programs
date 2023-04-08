import javax.xml.namespace.QName;
import java.sql.*;
//CURD  Program
public class DatabseExample {
    public static void main(String[] args) {
        // Registration of Driver
        try{
            Class.forName("com.jdbc.cj.jdbc.Driver");
        }catch (Exception e){

        }
//        ---------------------------------------------------------------
        //Establishing Connection
        try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mangesh","root","");
            Statement st=con.createStatement();

            //Inserting into database using query
            PreparedStatement pst=con.prepareStatement("INSERT INTO mydb (name) VALUES('ashish')");
            pst.executeUpdate();

            // getting results/retrieve from database
            ResultSet rs=st.executeQuery("SELECT * FROM mydb");
            while (rs.next()){
                String n=rs.getString("name");
                System.out.println(n);
            }
        }catch (Exception e){

        }
    }
}

