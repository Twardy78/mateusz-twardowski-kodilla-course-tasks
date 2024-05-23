package com.kodilla.testing.forum.statistics;

import java.util.List;

public class Statistics {
    public StatisticsData statisticsData;
    private double averPostsPerUser;
    private double averCommentsPerUser;
    private double averCommentsPerPost;
    private int userQty;
    private int postCountQty;
    private int commentCountQty;

    public Statistics(StatisticsData statisticsData) {
        this.statisticsData = statisticsData;
    }

    public void calculateAdvStatistics(StatisticsData statisticsData) {
        userQty = statisticsData.usersNames().size();
        postCountQty = statisticsData.postsCount();
        commentCountQty = statisticsData.commentsCount();
        averPostsPerUser = postCountQty * 1.0 / userQty;
        averCommentsPerUser = commentCountQty * 1.0 / userQty;
        averCommentsPerPost = commentCountQty * 1.0 / postCountQty;
    }

    public int getUserQty() {
        return userQty;
    }

    public int getPostCountQty() {
        return postCountQty;
    }

    public int getCommentCountQty() {
        return commentCountQty;
    }

    public double getAverPostsPerUser() {
        return averPostsPerUser;
    }

    public double getAverCommentsPerUser() {
        return averCommentsPerUser;
    }

    public double getAverCommentsPerPost() {
        return averCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("User qty : " + userQty );
        System.out.println("Post count : " + postCountQty );
        System.out.println("Comment count : " + commentCountQty );
        if (userQty > 0) {
            System.out.println("Aver posts per user : " + averPostsPerUser );
            System.out.println("Aver comments per user : " + averCommentsPerUser );
        }else
            System.out.println("Average post or comments per user can't be divide by 0 !!!");
        if (postCountQty > 0) {
            System.out.println("Aver comments per post : " + averCommentsPerPost);
        }else
            System.out.println("Average comments per post can't be divide by 0 !!!");
    }
}



