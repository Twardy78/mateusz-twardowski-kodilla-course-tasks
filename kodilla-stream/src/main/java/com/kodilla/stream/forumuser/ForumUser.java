package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char userSex;
    LocalDate usedBirthday;
    private final int userPostsQty;

    public ForumUser(int userID, String userName, char userSex, LocalDate usedBirthday, int userPostsQty) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.usedBirthday = usedBirthday;
        this.userPostsQty = userPostsQty;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUsedBirthday() {
        return usedBirthday;
    }

    public int getUserPostsQty() {
        return userPostsQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userID == forumUser.userID && userSex == forumUser.userSex && userPostsQty == forumUser.userPostsQty && Objects.equals(userName, forumUser.userName) && Objects.equals(usedBirthday, forumUser.usedBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, userSex, usedBirthday, userPostsQty);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID= " + userID +
                ", userName = " + userName + '\'' +
                ", userSex = " + userSex +
                ", usedBirthday = " + usedBirthday +
                ", userPostsQty = " + userPostsQty +
                '}';
    }
}
