package level1;

public class BookMain {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("Harry Potter", "J.K. Rowling", 350);

        defaultBook.display();
        customBook.display();
    }
}
