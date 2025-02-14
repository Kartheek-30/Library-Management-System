package com.librarymanagement.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library () {
        this.books = new ArrayList<>();
    }

    public void addBooks (Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void showAvailableBooks() {
        System.out.println("Available books in the library:");
        for(Book book: books) {
            if(book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public Book getBookId (int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
