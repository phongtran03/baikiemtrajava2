import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void menu(){
        System.out.println("1. Add Book");
        System.out.println("2. Save Book");
        System.out.println("3. Display Book");
        System.out.println("4. Exit");
    }


    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        BookController bookController = new BookController();
      int choice = 0;
        do{
            menu();
            choice = input.nextInt();
            switch (choice){
                case 1:
                    bookController.addBook();
                    break;

                case 2:
                    bookController.saveBook();
                    break;

                case 3:
                    bookController.displayBook();
                    break;

                case 4:
                    System.exit(0);
            }
        }while (true);
    }
}
