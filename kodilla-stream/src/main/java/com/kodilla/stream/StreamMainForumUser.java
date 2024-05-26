package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;


public class StreamMainForumUser {
    public static void main(String[] args) {
        LocalDate beforeTwentyYears = LocalDate.now().minusYears(20);
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResult = theForum.getUserList().stream()
                .filter(u -> u.getUserSex() == 'M')
                .filter(u->u.getUsedBirthday().isBefore(beforeTwentyYears) || u.getUsedBirthday().isEqual(beforeTwentyYears))
                .filter(u->u.getUserPostsQty() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, F-> F));

        theResult.entrySet().stream()
                .map(f ->f.getKey() + " " + f.getValue())
                .forEach(System.out::println);
        }
}
