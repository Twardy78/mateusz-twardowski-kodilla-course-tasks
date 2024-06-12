package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {
        User user = null;
        MassageSender sender = new MassageSender();

        try {
            sender.sendMassageTo(user, "Hello!");
        }catch (MassageNotSentException e) {
            System.out.println("Message is not send," +
                    "but my program still running very well!");
        }
        System.out.println("Processing other logic!");
    }
}
