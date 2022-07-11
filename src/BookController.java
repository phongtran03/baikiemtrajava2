import javax.script.ScriptContext;
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class BookController implements BookService{
    Scanner input = new Scanner(System.in);
     Connection connection = ConnectDB.getConnection();

    public BookController() throws SQLException {
    }

    private static String read = "select * from book";

    @Override
    public String saveBook() throws SQLException {
        String querySave = "insert into book values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(querySave);
        preparedStatement.setString(1, "B01010");
        preparedStatement.setString(2, "Master Your Mind, Design Your Destiny");
        preparedStatement.setString(3, "Adam Khoo");
        preparedStatement.setString(4,"$28");
        preparedStatement.executeUpdate();
        return "Thanh cong";
    }

    @Override
    public String addBook() {
        String idBook = "B01010";
        String nameBook = "Master Your Mind, Design Your Destiny";
        String author = "Adam Khoo";
        String price = "$28";
        System.out.println(idBook + " | " + nameBook + " | " + author + " | " + price);
        return "Thanh Cong";
    }

    @Override
    public String displayBook() throws SQLException {
        String read = "select * from book";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(read);
        while(resultSet.next()){
           String id = resultSet.getString(1);
           String name = resultSet.getString(2);
           String author = resultSet.getString(3);
           String price = resultSet.getString(4);
            System.out.println(id + " | " + name + " | " + author + " | " + price);
        }
        return "Thanh Cong";
    }

}
