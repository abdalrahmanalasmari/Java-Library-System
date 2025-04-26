
import java.util.ArrayList;
public class Library {

	    private ArrayList<Book> books;

	    public Library() {
	        books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Book added successfully.");
	    }

	    public void listBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books in the library.");
	            return;
	        }

	        System.out.println("\nBooks in the Library:");
	        for (Book b : books) {
	            System.out.println(b);
	        }
	    }
	}


