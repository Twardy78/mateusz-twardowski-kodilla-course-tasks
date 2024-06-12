package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        User user = new User(null);

        Optional<User> optinalUser = Optional.ofNullable(user);

        String userName = optinalUser.orElse(new User("")).getName();

        System.out.println(userName);
    }
}
