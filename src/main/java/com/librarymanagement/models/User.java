package com.librarymanagement.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<Book> borrowedBooks;

    public User (int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if(book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if(borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow this book");
        }
    }
}
