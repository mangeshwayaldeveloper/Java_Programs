import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {

    public static void main(String[] args) throws SQLException{
        // TODO Auto-generated method stub
        String url="jdbc:mysql://localhost:3306/mangesh";
        String uname="root";
        String password="";
        String query="select * from dyp";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection con=DriverManager.getConnection(url,uname,password);
            Statement statement=con.createStatement();
            int r = statement.executeUpdate("Insert into dyp (UserName,Gender,FatherName,password,City) values ('abc','male','yz','asc','pune')");
            ResultSet result=statement.executeQuery(query);
            while(result.next()) {
                String test="";
                for(int i=1;i<=5;i++) {
                    test+=result.getString(i)+":";
                }
                System.out.println(test);
            }
            //System.out.println(result);

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
