package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@Nested
@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;


        @DisplayName("Test books return condition")
        @Test
        void testListBooksWithConditionReturnList () {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
            //When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
            //Then
            assertEquals(4, theListOfBooks.size());
        }

        @DisplayName("Test books condition more then 20")
        @Test
        void testListBooksWithConditionMoreThen20 () {

            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfOBooks = new ArrayList<>();
            List<Book> resultListOf15Books = generateLisOfNBooks(15);
            List<Book> resultListOF40Books = generateLisOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOfOBooks);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOF40Books);
            //When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("AnyTitle");
            List<Book> theLsitOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            //Then
            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theLsitOfBooks40.size());
        }
        @DisplayName("Test books condition shorter then 3")

        @Test
        void testListBooksWithConditionFragmentShorterThen3 () {
            //Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            //When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
            //Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
            }

        @DisplayName("Test not books in hands of by user")

        @Test
            void testListNotBooksInHandsOf() {
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Adam", "Kopek", 56031256);
            //When
            List<Book> theListNoBooksInHandsOf = bookLibrary.listBooksInHandOf(libraryUser);
            //Then
            assertEquals(0,theListNoBooksInHandsOf.size());
            }

        @DisplayName("Test one book in hand of by user")

        @Test
        void testListOneBookInHandsOf(){
            //Give
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Adam", "Kopek", 56031256);
            List<Book> resultListOneBookInHandsOf = generateLisOfNBooks(1);
            when(libraryDatabaseMock.listBooksInHandOf(libraryUser)).thenReturn(resultListOneBookInHandsOf);
            //When
            List<Book> theListOneBookInHandsOf = bookLibrary.listBooksInHandOf(libraryUser);
            //Then
            assertEquals(1,theListOneBookInHandsOf.size());
            }

    @DisplayName("Test five book in hand of by user")

        @Test
        void testListFiveBookInHandsOf(){
             //Give
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Adam", "Kopek", 56031256);
             List<Book> resultListFiveBookInHandsOf = generateLisOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandOf(libraryUser)).thenReturn(resultListFiveBookInHandsOf);
            //When
            List<Book> theListFiveBookInHandsOf = bookLibrary.listBooksInHandOf(libraryUser);
            //Then
            assertEquals(5,theListFiveBookInHandsOf.size());
            }

    //class to generate list of N books
    private List<Book> generateLisOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
            }
        return resultList;

    }

}