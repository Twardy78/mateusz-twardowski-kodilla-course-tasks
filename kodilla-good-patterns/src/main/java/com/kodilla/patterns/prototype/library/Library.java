package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends ClonePrototype<Library>{

    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowClone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepClone() throws CloneNotSupportedException {
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>(books);
        for (Book book : books) {
            cloneLibrary.getBooks().add(book);
        }return cloneLibrary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library library)) return false;
        return Objects.equals(name, library.name) && Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }
}
