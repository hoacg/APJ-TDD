package com.elib;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagerTest {

    LibraryManager libraryManager;

    @BeforeEach
    void setup() {
        libraryManager = new LibraryManager();
    }

    @Test
    void assert_Cannot_Over_Three_Books() {
        Book[] books = {
                new Book(1, "Sách 1", "Tác giả 1"),
                new Book(2, "Sách 2", "Tác giả 2"),
                new Book(3, "Sách 3", "Tác giả 3"),
                new Book(4, "Sách 4", "Tác giả 4"),
        };
        Student student = new Student();
        BorrowOrder borrowOrder = libraryManager.borrowBooks(student, books);
        assertNull(borrowOrder);
    }

    @Test
    void assert_Cannot_Borrow_Books_When_Books_Is_Empty() {
        Book[] books = {};
        Student student = new Student();
        BorrowOrder borrowOrder = libraryManager.borrowBooks(student, books);
        assertNull(borrowOrder);
    }

    @Test
    void assert_Borrow_Books_Successfully() {
        Book[] books = {
                new Book(1, "Sách 1", "Tác giả 1"),
                new Book(2, "Sách 2", "Tác giả 2"),
                new Book(3, "Sách 3", "Tác giả 3")
        };
        Student student = new Student();
        BorrowOrder borrowOrder = libraryManager.borrowBooks(student, books);
        assertNotNull(borrowOrder);
        assertEquals(libraryManager.STATUS_BORROWING, borrowOrder.getStatus());
    }

    @Test
    void assert_Cannot_Borrow_Books_When_Books_Is_Borrowed() {
        Book[] books = {
                new Book(1, "Sách 1", "Tác giả 1", Book.BORROWED),
                new Book(2, "Sách 2", "Tác giả 2"),
                new Book(3, "Sách 3", "Tác giả 3")
        };
        Student student = new Student();
        BorrowOrder borrowOrder = libraryManager.borrowBooks(student, books);
        assertNull(borrowOrder);
    }

    @Test
    void returnBooks() {
    }

    @Test
    void getBookStatus() {
    }
}
