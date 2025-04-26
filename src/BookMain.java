
import java.util.Scanner;
public class BookMain {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Library library = new Library();

	        System.out.println("=== Welcome to the Library System ===");

	        boolean exit = false;
	        while (!exit) {
	            System.out.println("\n1. Add Book");
	            System.out.println("2. List Books");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (option) {
	                case 1:
	                    System.out.print("Enter Book Name: ");
	                    String bookName = scanner.nextLine();

	                    System.out.print("Enter Author Name: ");
	                    String authorName = scanner.nextLine();

	                    System.out.print("Enter Author Email: ");
	                    String authorEmail = scanner.nextLine();

	                    System.out.print("Enter Author Gender (M/F): ");
	                    char gender = scanner.nextLine().charAt(0);

	                    System.out.print("Enter Book Price: ");
	                    double price = scanner.nextDouble();

	                    System.out.print("Enter Quantity: ");
	                    int qty = scanner.nextInt();
	                    scanner.nextLine(); // consume newline

	                    Author author = new Author(authorName, authorEmail, gender);
	                    Book book = new Book(bookName, author, price, qty);

	                    library.addBook(book);
	                    break;

	                case 2:
	                    library.listBooks();
	                    break;

	                case 3:
	                    exit = true;
	                    System.out.println("Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid option. Try again.");
	            }
	        }

	        scanner.close();
	    }
	}
