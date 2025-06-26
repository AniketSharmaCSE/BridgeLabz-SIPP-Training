package level1;

public class Book {
    //Static variable shared across all books
    static String libraryName = "City Library";

    //Final variable, cannot be changed after initialization
    final String isbn;

    //Instance variables
    String title;
    String author;

    //Constructor using this. keyword
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    //Method to display book details
    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
