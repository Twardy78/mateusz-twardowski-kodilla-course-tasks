package com.kodilla.good.patterns.challenges;

public class User {

    private String nickName;
    private String name;
    private String lastName;
    private String email;
    private int phone;

    public User(String nickName, String name, String lastName, String email, int phone) {
        this.nickName = nickName;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    }
}
