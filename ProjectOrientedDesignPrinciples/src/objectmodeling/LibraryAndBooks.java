package objectmodeling;
import java.util.*;
public class LibraryAndBooks {
		public class Book{
			String title;
			String author;
		
		
		public Book(String title, String author){
			this.title = title;
			this.author = author;
			
		}
		
		public void displayBooks() {
			System.out.println("Title: "+title+"Author: "+author);
		}
}
		public class Library{
			String name;
			ArrayList<Book> books;
			
			public Library(String name) {
				this.name = name;
				books = new ArrayList<>();
				}
			public void addBook(Book b) {
				books.add(b);
			}
			public void displayBooks() {
				System.out.println("Library: "+name);
				System.out.println("books: ");
				
				for (Book b : books) {
					b.displayBooks();
				}
				System.out.println();
			}
			}
		
		}

