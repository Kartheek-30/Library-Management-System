package com.librarymanagement;

import com.librarymanagement.models.Book;
import com.librarymanagement.models.Library;
import com.librarymanagement.models.User;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        User user1 = new User(1, "Kartheek");

        //Adding Books
        library.addBooks(new Book(1, "Ramayana", "Valmiki Maharshi", true));
        library.addBooks(new Book(2, "Maha Bharatham", "Ganesha", true));
        library.addBooks(new Book(3, "Do Epic Shit", "Ankur Warikoo", true));
        library.addBooks(new Book(4, "Get Epic Shit Done", "Ankur Warikoo", true));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.showAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    Book borrowBook = library.getBookId(borrowId);
                    if (borrowBook != null) {
                        user1.borrowBook(borrowBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter book ID to return: ");
                    int returnId = sc.nextInt();
                    Book returnBook = library.getBookId(returnId);
                    if (returnBook != null) {
                        user1.returnBook(returnBook);
                    } else {
                        System.out.println("Invalid Book ID.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the Library system. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}