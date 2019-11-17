package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;


    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }




    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostPerUser = calculatePostsAvgPerUser();
        averageCommentsPerUser = calculateCommentsAveragePerUser();
        averageCommentsPerPost = calculateCommentsAveragePerPost();
    }

    private double calculatePostsAvgPerUser() {

        if(usersQuantity >0){
            return (double) postsQuantity / usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAveragePerUser() {
        if(usersQuantity >0){
            return (double) commentsQuantity / usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAveragePerPost() {
        if(postsQuantity >0){
            return (double) commentsQuantity / postsQuantity;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Forum advanced statistics:");
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Posts average per user: " + averagePostPerUser);
        System.out.println("Comments average per user: " + averageCommentsPerUser);
        System.out.println("Comments average per post: " + averageCommentsPerPost);
    }

}
