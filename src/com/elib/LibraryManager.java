package com.elib;

public class LibraryManager {
    final static int STATUS_BORROWING = 1;
    final static int STATUS_RETURNED = 2;

    BorrowOrder borrowBooks(Student student, Book[] books) {
        throw new UnsupportedOperationException();
    }

    BorrowOrder returnBooks(Student student, Book[] books) {
        throw new UnsupportedOperationException();
    }

    int getBookStatus(int bookId) {
        return 0;
    }
}
