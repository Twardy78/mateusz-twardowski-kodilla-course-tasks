package com.kodilla.exception.index;

import java.util.*;

public class IndexExceptionRunner {

    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collection = videoCollector.getCollcetion();

        if (collection.size()>2) {
            String movie = collection.get(0);
            System.out.println("Movie: " + movie);

            String movie2 = collection.get(2);
            System.out.println("Movie2: " + movie2);
        }
    }
}
