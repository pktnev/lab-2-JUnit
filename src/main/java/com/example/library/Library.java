package com.example.library;

import java.util.*;

public class Library {
    public List<Book> sortBooksByTitle(List<Book> books) {
        books.sort(Comparator.comparing(Book::getTitle));
        return books;
    }

    public List<Book> sortBooksByAuthor(List<Book> books) {
        books.sort(Comparator.comparing(Book::getAuthor));
        return books;
    }

    public List<Book> sortBooksByYear(List<Book> books) {
        books.sort(Comparator.comparingInt(Book::getYear));
        return books;
    }

    public List<Book> sortBooksByPrice(List<Book> books) {
        books.sort(Comparator.comparingDouble(Book::getPrice));
        return books;
    }
}
