package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookServiceTestSuite {

    private BookService bookService;

    @BeforeEach
    public void setup() {
        bookService = new BookService();
    }

    @Test
    public void shouldReturnEmptyListWhenNoBooksAdded() {

        List<BookDto> books = bookService.getBooks();


        assertTrue(books.isEmpty());
    }

    @Test
    public void shouldAddBookToList() {

        BookDto book = new BookDto("Title1", "Author1");


        bookService.addBook(book);
        List<BookDto> books = bookService.getBooks();


        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

    @Test
    public void shouldAddMultipleBooksToList() {

        BookDto book1 = new BookDto("Title1", "Author1");
        BookDto book2 = new BookDto("Title2", "Author2");


        bookService.addBook(book1);
        bookService.addBook(book2);
        List<BookDto> books = bookService.getBooks();


        assertEquals(2, books.size());
        assertTrue(books.contains(book1));
        assertTrue(books.contains(book2));
    }

    @Test
    public void shouldRemoveBookFromList() {

        BookDto book1 = new BookDto("Title1", "Author1");
        BookDto book2 = new BookDto("Title2", "Author2");
        bookService.addBook(book1);
        bookService.addBook(book2);


        bookService.removeBook(book1);
        List<BookDto> books = bookService.getBooks();


        assertEquals(1, books.size());
        assertTrue(books.contains(book2));
    }

    @Test
    public void shouldNotFailWhenRemovingNonExistingBook() {

        BookDto book1 = new BookDto("Title1", "Author1");
        BookDto book2 = new BookDto("Title2", "Author2");
        bookService.addBook(book1);


        bookService.removeBook(book2);
        List<BookDto> books = bookService.getBooks();


        assertEquals(1, books.size());
        assertTrue(books.contains(book1));
    }

    @Test
    public void shouldReturnEmptyListAfterRemovingAllBooks() {

        BookDto book1 = new BookDto("Title1", "Author1");
        BookDto book2 = new BookDto("Title2", "Author2");
        bookService.addBook(book1);
        bookService.addBook(book2);


        bookService.removeBook(book1);
        bookService.removeBook(book2);
        List<BookDto> books = bookService.getBooks();


        assertTrue(books.isEmpty());
    }
}
