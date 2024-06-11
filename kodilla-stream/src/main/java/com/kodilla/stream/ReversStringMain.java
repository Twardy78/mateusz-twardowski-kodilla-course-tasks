package com.kodilla.stream;

import com.kodilla.stream.reverse.ReversString;

public class ReversStringMain {

    public static void main(String[] args) {
        String originalString = "Bogdan";
        ReversString reversString = new ReversString();
        reversString.stringRevers(originalString);
    }
}
