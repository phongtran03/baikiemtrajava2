import java.sql.SQLException;
import java.util.List;

public interface BookService {
    public String addBook() throws SQLException;
    public String saveBook() throws SQLException;
    public String displayBook() throws SQLException;

}
