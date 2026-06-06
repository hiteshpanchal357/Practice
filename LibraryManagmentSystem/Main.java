public class Main {
    
    public static void main(String[] args){

        Library library = new Library();

        Book b1 = new Book(101,"Java programming ","Deepak sir");
        Book b2 = new Book(102,"DSA","hitesh panchal");
        Book b3 = new Book(103,"DBMA","archana");

        library.addBook(b1);
        library.addBook(b2);
System.out.println("------------------------------");
        library.displayBooks();
System.out.println("------------------------------");

        System.out.println();

        library.issueBook(102);
        System.out.println();
    }
}
