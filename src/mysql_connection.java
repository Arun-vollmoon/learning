import java.sql.*;

public class mysql_connection {
    public static Connection getConnection() throws Exception {
        String url="jdbc:mysql://localhost:3306/test";
        String name="root";
        String password="Arun@2200";
        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(url,name,password);


    }
}
