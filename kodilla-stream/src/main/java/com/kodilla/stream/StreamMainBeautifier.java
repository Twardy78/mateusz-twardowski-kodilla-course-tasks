package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMainBeautifier {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Adam", (b) -> "@@@");
        poemBeautifier.beautify("Adam", (b) -> "$$$");
        poemBeautifier.beautify("Martyna", (b) -> "^^^");
        poemBeautifier.beautify("Grazyna", (b) -> "+++");
        poemBeautifier.beautify("Mateusz", (b) -> "***");
    }
}
