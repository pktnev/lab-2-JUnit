package com.example.library;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testSortBooksByTitle() {
        List<Book> books = Arrays.asList(
                new Book("Zebra", "Author A", 2020, 15.99),
                new Book("Apple", "Author B", 2021, 12.99)
        );

        Library library = new Library();
        List<Book> sortedBooks = library.sortBooksByTitle(books);

        assertEquals("Apple", sortedBooks.get(0).getTitle());
        assertEquals("Zebra", sortedBooks.get(1).getTitle());
    }

    @Test
    public void testSortBooksByAuthor() {
        List<Book> books = Arrays.asList(
                new Book("Book A", "Author Z", 2020, 15.99),
                new Book("Book B", "Author A", 2021, 12.99)
        );

        Library library = new Library();
        List<Book> sortedBooks = library.sortBooksByAuthor(books);

        assertEquals("Author A", sortedBooks.get(0).getAuthor());
        assertEquals("Author Z", sortedBooks.get(1).getAuthor());
    }

    @Test
    public void testSortBooksByYear() {
        List<Book> books = Arrays.asList(
                new Book("Book A", "Author A", 2021, 15.99),
                new Book("Book B", "Author B", 2020, 12.99)
        );

        Library library = new Library();
        List<Book> sortedBooks = library.sortBooksByYear(books);

        assertEquals(2020, sortedBooks.get(0).getYear());
        assertEquals(2021, sortedBooks.get(1).getYear());
    }

    @Test
    public void testSortBooksByPrice() {
        List<Book> books = Arrays.asList(
                new Book("Book A", "Author A", 2020, 15.99),
                new Book("Book B", "Author B", 2021, 12.99)
        );

        Library library = new Library();
        List<Book> sortedBooks = library.sortBooksByPrice(books);

        assertEquals(12.99, sortedBooks.get(0).getPrice());
        assertEquals(15.99, sortedBooks.get(1).getPrice());
    }
}
