package com.elib;

public class Book {

    final static int AVAILABLE = 0;
    final static int BORROWED = 1;

    private int id;
    private String title;
    private String authors;
    private int status;

    public Book() {
    }

    public Book(int id, String title, String authors) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.status = AVAILABLE;
    }

    public Book(int id, String title, String authors, int status) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
