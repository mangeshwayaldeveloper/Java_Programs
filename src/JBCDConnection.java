import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.sql.ResultSet;

public class JBCDConnection {
    public static void main(String[] args) throws SQLException{
//
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (Exception e) {
            System.out.println("Error: unable to load driver");
            System.exit(1);
        }

//      String url="jdbc:name of the database//host:port/name of the database     general form
        String url="jdbc:mysql://localhost:3306/mangesh";
        String uname="root";   //generally we used this
        String pass="";      // if not set then it is blank
        String query="select * from dyp";
        Connection connection=DriverManager.getConnection(url,uname,pass);
        Statement st =connection.createStatement();
        ResultSet set=st.executeQuery(query);
        while(set.next()){
            String string="";
            for (int i=1;i<5;i++){
                string+=set.getString(i)+":";

            }
            System.out.println(string);
        }
//
//        PreparedStatement pt=null;
//        String sql="Update mangesh set username='dypimer' ? WHERE email='mangesh@gmail.com' ";
//        pt=connection.prepareStatement(sql);
//
//        CallableStatement cs=null;
//        String sql2="{call getusername(?,?)";
//        cs=connection.prepareCall(sql2);


    }
}
