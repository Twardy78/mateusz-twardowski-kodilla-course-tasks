package com.kodilla.stream.forumuser;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public final class Forum {
//   This class must have a list of users (getUserList)

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(7001,"Adam Smith", 'M', LocalDate.of(2004, 5,18), 98));
        userList.add(new ForumUser(5062,"Joanne White", 'F', LocalDate.of(1976, 8,4), 54));
        userList.add(new ForumUser(6543,"Jonathan Worden ", 'M', LocalDate.of(1984, 9,3), 7));
        userList.add(new ForumUser(5453,"Jenifer Taylor", 'F', LocalDate.of(2010, 11,11), 987));
        userList.add(new ForumUser(5666,"Bob Schmitt", 'M', LocalDate.of(1983, 2,21), 23));
        userList.add(new ForumUser(6432,"Lian Rain", 'M', LocalDate.of(1970, 7,25), 45));
        userList.add(new ForumUser(7963,"Lisa Burond", 'M', LocalDate.of(2013, 9,2), 9));
        userList.add(new ForumUser(8247,"Richard Grain", 'M', LocalDate.of(1970, 4,14), 4456));
        userList.add(new ForumUser(8247,"Shain Woodcroft", 'F', LocalDate.of(2024, 6,22), 0));
        userList.add(new ForumUser(8247,"John Grainstone", 'M', LocalDate.of(2024, 1,7), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
