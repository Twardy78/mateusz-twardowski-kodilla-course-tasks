package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;
import java.util.Objects;

public final class Book {

    final String title;
    final String author;
    final LocalDate publicationDate;

    public Book(String title, String author, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Title : " + title + " \\ " + author + " (" + publicationDate + ") ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publicationDate, book.publicationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationDate);
    }
}
