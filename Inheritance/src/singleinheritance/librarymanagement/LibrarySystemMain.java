package singleinheritance.librarymanagement;

public class LibrarySystemMain {
    public static void main(String[] args) {
        Author author = new Author(
            "Wings of Fire",
            1999,
            "Dr. A.P.J. Abdul Kalam",
            "Missile Man of India and the 11th President of India."
        );

        System.out.println("--- Book & Author Information ---");
        author.displayInfo();
    }
}

