package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.referance.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Adam", (b) -> "@@@");
        poemBeautifier.beautify("Adam", (b) -> "$$$");
        poemBeautifier.beautify("Martyna", (b) -> "^^^");
        poemBeautifier.beautify("Grazyna", (b) -> "+++");
        poemBeautifier.beautify("Mateusz", (b) -> "***");
    }
}
