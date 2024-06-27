package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBook() {
        //Given
        Library library = new Library("Library 1 \n");
        library.getBooks().add(new Book("Potop", "Henryk Sienkiewicz", LocalDate.of(2020, 5, 13)));
        library.getBooks().add(new Book("Bieszczady dla tych, ktorzy chca je poznac naprawde", "Adrian Markowski", LocalDate.of(2022, 3,23)));
        library.getBooks().add(new Book("Jade sobie. Powrot do Azji", "Marzena Filipczak", LocalDate.of(2020, 11, 23)));
        library.getBooks().add(new Book("Italia. Kraina kontrastow i roznorodnosci. Wlochy polnocne", "Natalia Rosiak", LocalDate.of(2023,9,19)));
        library.getBooks().add(new Book("Perly Polski","Monika Korolczuk", LocalDate.of(2023,6,16)));

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowClone();
            cloneLibrary.setName("Library 1 (Cloned) \n");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepClone();
            deepCloneLibrary.setName("Library 1 (Deep Cloned) \n");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //When
        library.getBooks().remove(new Book("Perly Polski","Monika Korolczuk", LocalDate.of(2023,6,16)));
        //Then
        System.out.println(library.getName() + library.getBooks());
        System.out.println();
        System.out.println(cloneLibrary.getName() + cloneLibrary.getBooks());
        System.out.println();
        System.out.println(deepCloneLibrary.getName() + deepCloneLibrary.getBooks());
        assertEquals(4, library.getBooks().size());
        assertEquals(4, cloneLibrary.getBooks().size());
        assertEquals(5, deepCloneLibrary.getBooks().size());
        assertNotEquals(library.getBooks().size(), deepCloneLibrary.getBooks().size());
        assertEquals(library.getBooks().size(), cloneLibrary.getBooks().size());
    }
}
