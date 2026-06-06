import java.util.*;

public class Library {

    private ArrayList<Book> books;

    public Library() {

        books = new ArrayList<>();

    }

    // Add book

    public void addBook(Book book){

        books.add(book);
        System.out.println(
            book.getTitle() + " added successfullly " + " and the "+ "Author name is " + book.getAuthor()
            

        );


    }
    // Display Books

    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books are available");

            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search Book

    public Book searchBook(int bookId) {

        for (Book book : books) {

            if (books.isEmpty()) {
                System.out.println("Books are not available");
                return null;
            } else if (book.getBookId() == bookId) {

                return book;

            }

        }
        return null;

    }

    // issue book

    public void issueBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        book.setIssued(true);

        System.out.println("Book issued successfullly");

    }

    // return book

    public void returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("Book not found");
            return;
        } else if (!book.isIssued()) {
            System.out.println("Book is alreay available");
            return;

        }
        book.setIssued(false);

        System.out.println("Book returned successfully");

    }

}
