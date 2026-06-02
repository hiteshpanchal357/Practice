
public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean issued;

    public Book(int bookId, String title, String author) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;

    }

    // Encapsulation

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // set kar rahe he
    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + (issued ? "Yes" : "No"));

    }

}
