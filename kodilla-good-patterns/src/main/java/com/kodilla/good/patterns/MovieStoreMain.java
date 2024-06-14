package com.kodilla.good.patterns;

import java.util.*;

public class MovieStoreMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> movies = movieStore.getMovies();
            for (Map.Entry<String, List<String>> entry : movies.entrySet()) {
                entry.getValue().stream()
                        .forEach(t -> System.out.print(t + "! "));

            }
    }
}
