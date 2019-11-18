package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;


    @Before
    public void beforeTest(){
        statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        forumStatistics = new ForumStatistics();
    }

    // gdy liczba postów = 0
    @Test
    public void testCalculateAdvStatisticsWithZeroPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostsQuantity(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAveragePostPerUser(), 0.01);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.01);

    }

    //gdy liczba postów = 1000
    @Test
    public void testCalculateAdvStatisticsWithThousandPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostsQuantity(), 0.01);
        assertEquals(100, forumStatistics.getAveragePostPerUser(), 0.01);
        assertEquals(0.04, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    //gdy liczba komentarzy = 0
    @Test
    public void testCalculateAdvStatisticsWithZeroComments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsQuantity(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    //gdy liczba komentarzy < liczba postów
    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, forumStatistics.getPostsQuantity(), 0.01);
        assertEquals(2, forumStatistics.getCommentsQuantity(), 0.01);
        assertEquals(1, forumStatistics.getAveragePostPerUser(), 0.01);
        assertEquals(0.2, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0.2, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    //gdy liczba komentarzy > liczba postów
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20, forumStatistics.getPostsQuantity(), 0.01);
        assertEquals(40, forumStatistics.getCommentsQuantity(), 0.01);
        assertEquals(2, forumStatistics.getAveragePostPerUser(), 0.01);
        assertEquals(4, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(2, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    //gdy liczba użytkowników = 0
    @Test
    public void testCalculateAdvStatisticsWithZeroUsers(){
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUsersQuantity(), 0.01);
        assertEquals(0, forumStatistics.getAveragePostPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.01);

    }

    //gdy liczba użytkowników = 100
    @Test
    public void testCalculateAdvStatisticsWithHundredUsers(){
        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsersQuantity(), 0.01);
        assertEquals(0.2, forumStatistics.getAveragePostPerUser(), 0.01);
        assertEquals(0.4, forumStatistics.getAverageCommentsPerUser(), 0.01);
    }

}