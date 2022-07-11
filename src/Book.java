
public class Book {
    private String bookId;
    private String bookName;
    private String author;
    private String Price;

    public Book(String bookId, String bookName, String author, String price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.Price = price;
    }

    public Book() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", Price=" + Price +
                '}';
    }
}
