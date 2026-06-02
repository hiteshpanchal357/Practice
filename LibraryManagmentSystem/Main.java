public class Main {
    
    public static void main(String [] args){

        Library library = new Library();

        Book b1 = new Book(
            101,
            "Java Programming",
            "Lalu Yadav"
        );

        Book b2= new Book(
            102,
            "Data Strucuter",
            "Hitesh panchal"
        );

        Book b3 =
                new Book(
                        103,
                        "Clean Code",
                        "Robert Martin"
                );

                library.addBook(b1);
                library.addBook(b2);
                library.addBook(b3);

                library.displayBooks();
    }
}
