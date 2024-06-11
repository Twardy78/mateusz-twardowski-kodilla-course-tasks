package com.kodilla.stream.reverse;

public class ReversString {

    public void stringRevers (String original) {
        for (int i = original.length() - 1; i >=0; i--) {
            System.out.print(original.charAt(i));
        }
    }
}
