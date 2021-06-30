package io.danilopiazza.github.spring.boot.activemq.entity;

public class Book {
    private final String isbn;
    private final String author;
    private final String title;
    private final int pages;

    public Book(String isbn, String author, String title, int pages) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", isbn=" + isbn + ", pages=" + pages + ", title=" + title + "]";
    }
}
