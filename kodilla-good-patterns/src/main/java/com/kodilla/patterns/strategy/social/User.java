package com.kodilla.patterns.strategy.social;

public sealed class User permits Millenials, YGeneration, ZGeneration{

    private String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return publisher.share();
    }

    public void setShearingStrategies(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
