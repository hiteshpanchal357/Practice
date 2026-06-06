public class Book{

    private int bookId ;
    private String title;
    private String author;
    private boolean issued;

    public Book(int bookId , String title,String author){

        this.bookId = bookId;
        this.title = title;
        this.author = author ;
        this.issued = false;

    }

    //Encapsulation

    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }

    public boolean isIssued(){
        return issued;
    }

    public String getAuthor(){
        return author;
    }

    public void setIssued(boolean issued){
        this.issued = issued;
    }

    public void displayBook(){
        System.out.println("Book Id is " + bookId);
        System.out.println("Book Title is " + title);       
        System.out.println("Book Author is " + author);
        System.out.println("Book Issued is " + issued);

    }
}

