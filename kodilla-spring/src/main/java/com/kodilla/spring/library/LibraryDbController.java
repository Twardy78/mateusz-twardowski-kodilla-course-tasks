package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository
public final class LibraryDbController {

    public void saveData() {
        System.out.println("Saving data to the data base");
    }

    public void loadData() {
        System.out.println("Loading data from the data base");
    }
}
