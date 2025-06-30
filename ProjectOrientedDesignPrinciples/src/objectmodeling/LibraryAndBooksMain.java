package objectmodeling;

public class LibraryAndBooksMain {
    public static void main(String[] args) {
        // Creating outer class instance
        LibraryAndBooks lab = new LibraryAndBooks();

        // Creating Library instance using outer class
        LibraryAndBooks.Library library = lab.new Library("Central Library");

        // Creating Book instances using outer class
        LibraryAndBooks.Book book1 = lab.new Book("The Alchemist ", "Paulo Coelho");
        LibraryAndBooks.Book book2 = lab.new Book("Harry Potter ", "J. K. Rowling");

        // Adding books to library
        library.addBook(book1);
        library.addBook(book2);

        // Displaying library books
        library.displayBooks();
    }
}
