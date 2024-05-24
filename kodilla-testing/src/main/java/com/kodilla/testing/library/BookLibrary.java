package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> booksList = new ArrayList<>();
        if (titleFragment.length() < 3) return booksList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return booksList;
        booksList = resultList;
        return booksList;
    }

    public List<Book> listBooksInHandOf(LibraryUser libraryUser) {
        List<Book> userBorrowBookList = libraryDatabase.listBooksInHandOf(libraryUser);
        ;
        return userBorrowBookList;

    }

    ;
}
