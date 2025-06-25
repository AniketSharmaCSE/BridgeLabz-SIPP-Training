package level1;

public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Blue World", "Aniket", 150);
        book.display();
        book.borrowBook();
        book.borrowBook(); // Trying to borrow again
    }
}
