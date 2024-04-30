package teamcpp;

import java.util.HashMap;
import java.util.Scanner;

class Library {
    private HashMap<String, Boolean> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String title) {
        books.put(title, true); // true means book is available
    }

    public void lendBook(String title) {
        if (books.containsKey(title)) {
            if (books.get(title)) {
                System.out.println("You've successfully borrowed " + title);
                books.put(title, false); // mark book as unavailable
            } else {
                System.out.println("Sorry, " + title + " is not available for borrowing.");
            }
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    public void returnBook(String title) {
        if (books.containsKey(title)) {
            System.out.println("Thank you for returning " + title);
            books.put(title, true); // mark book as available
        } else {
            System.out.println("Invalid book: " + title);
        }
    }
}

public class BookLending {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Book lending System!");
        System.out.println("1. Add a book\n2. Borrow a book\n3. Return a book\n4. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book to add: ");
                    library.addBook(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    library.lendBook(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    library.returnBook(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println(" Please enter a number between 1 and 4.");
            }
        }
    }
}
