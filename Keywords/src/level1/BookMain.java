package level1;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", "ISBN001");
        Book book2 = new Book("Data Structures", "Mark Allen", "ISBN002");

        // Use instanceof before showing details
        if (book1 instanceof Book) {
            book1.showDetails();
        }

        if (book2 instanceof Book) {
            book2.showDetails();
        }

        // Call static method
        Book.displayLibraryName();
    }
}
