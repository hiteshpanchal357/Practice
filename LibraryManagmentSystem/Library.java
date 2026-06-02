
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();

    }

    public void addBook(Book book) {

        books.add(book);
        System.out.println(
                book.getTitle() + "added successfully:)");
    }

    public void displayBooks(){

        if(books.isEmpty()){
            System.out.println("Books are not available");
            return;
        }

        for(Book book : books){
            book.displayBook();
        }
    }

    public Book searchBook(int bookId){

        for(Book book : books){
            if(book.getBookId()==bookId){
                return book;
            }
        }

        return null;
    }

    public void issueBook(int bookId){
        
        Book book = searchBook(bookId);

        if(book == null){
            System.out.println("Book not found");
            return;
        }
        book.setIssued(true);
        System.out.println(book.getTitle() + "issued successfully:)");

    }

    public void returnBook(int bookId){
        Book book = searchBook(bookId);

        if(book == null){
            System.out.println("Book not found");
            return;
        }
        book.setIssued(false);
        System.out.println(book.getTitle() + "returned successfully:)");
    }

}
