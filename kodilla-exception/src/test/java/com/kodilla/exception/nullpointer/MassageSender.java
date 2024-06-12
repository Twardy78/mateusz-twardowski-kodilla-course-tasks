package com.kodilla.exception.nullpointer;

public class MassageSender {

    public void sendMassageTo(User user, String message) throws MassageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        }else
            throw new MassageNotSentException("Object User was null");
    }
}
