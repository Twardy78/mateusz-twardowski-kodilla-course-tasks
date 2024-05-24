package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator){

        String result = poemDecorator.decorate(text);
        System.out.println(result + " " + text + " " + result);
    }
    public void beautify2(String text, PoemDecorator poemDecorator){

        String result = poemDecorator.decorate(text);
        String capital = result.toUpperCase();
        System.out.println(capital + " " + text + " " + capital);
    }

}
