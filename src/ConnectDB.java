import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
 public static Connection getConnection() throws SQLException {
     String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=baiKiemTraJava2";
     String username = "baiKiemTraJava2";
     String password = "123456789";

     Connection connection = DriverManager.getConnection(dbUrl, username, password);

     if(connection!=null){
         System.out.println("Thanh Cong");
     }
     return connection;
 }
}
