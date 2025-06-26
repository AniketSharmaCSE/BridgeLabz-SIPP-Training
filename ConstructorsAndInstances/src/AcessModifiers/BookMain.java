package AcessModifiers;

public class BookMain {
    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.ISBN = "978-123456";
        ebook.title = "Learn Java";
        ebook.setAuthor("Krishnamurthy");

        ebook.showBook();
        System.out.println("Author: " + ebook.getAuthor());
    }
}
