package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private Statistics statistics;
    List<String> usersNames;
    int usersCount;
    int postsCount;
    int commentsCount;
    int resultListOf1000Posts;
    int resultListOf0Posts;
    int resultListOf0Comments;

    @Mock
    private StatisticsData statisticsMock;

    @BeforeEach
    public void tests() {
        statistics = new Statistics(statisticsMock);
        usersNames = generateNUsers(96);
        usersCount = usersNames.size();
        postsCount = 287;
        commentsCount = 8765;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
    }

    @AfterEach
    public void after() {
        statistics.calculateAdvStatistics(statisticsMock);
        statistics.showStatistics();
    }

    @Nested
    @DisplayName("All Post Tests")
    class AllPostTests {
        @DisplayName("Test when posts quantity are 0")
        @Test
        public void testCalculateAdvStatisticsWhenPostsQuantityAre0() {
            //Given
            resultListOf0Posts = generateNPosts(0);
            when(statisticsMock.postsCount()).thenReturn(resultListOf0Posts);
            //When
            int theListOf0Posts = statistics.statisticsData.postsCount();
            //Then
            assertEquals(resultListOf0Posts, theListOf0Posts);
        }

        @DisplayName("Test when posts quantity are 1000")
        @Test
        public void testCalculateAdvStatisticsWhenPostsQuantityAre1000() {
            //Given
            resultListOf1000Posts = generateNPosts(1000);
            when(statisticsMock.postsCount()).thenReturn(resultListOf1000Posts);
            //When
            int theListOfQt1000Posts = statistics.statisticsData.postsCount();
            //Then
            assertEquals(resultListOf1000Posts, theListOfQt1000Posts);
        }
    }

    @Nested
    @DisplayName("All Comments Tests")
    class AllCommentsTests {
        @DisplayName("Test when comments quantity are 0")
        @Test
        public void testCalculateAdvStatisticsWhenCommentsQuantityAre0() {
            //Given
            resultListOf0Comments = generateNComments(0);
            when(statisticsMock.commentsCount()).thenReturn(resultListOf0Comments);
            //When
            int theListOF0Comments = statistics.statisticsData.commentsCount();
            //Then
            assertEquals(resultListOf0Comments, theListOF0Comments);
        }

        @DisplayName("Test less comments then posts")
        @Test
        public void testLessCommentsThenPosts() {
            //Give
            //When
            int theComments = statistics.statisticsData.commentsCount();
            int thePosts = statistics.statisticsData.postsCount();
            //Then
            assertTrue(theComments < thePosts);
        }

        @DisplayName("Test more comments then posts")
        @Test
        public void testMoreCommentsThenPosts() {
            //Give
            //When
            int theComments = statistics.statisticsData.commentsCount();
            int thePosts = statistics.statisticsData.postsCount();
            //Then
            assertTrue(theComments > thePosts);
        }
    }

    @Nested
    @DisplayName("All User Tests")
    class AllUserTests {
        @DisplayName("Test when users quantity are 0")
        @Test
        public void testCalculateAdvStatisticsWhenUsersQuantityAre0() {
            //Given
            List<String> usersNames0 = new ArrayList<>();
            when(statisticsMock.usersNames()).thenReturn(usersNames0);
            when(statisticsMock.postsCount()).thenReturn(postsCount);
            when(statisticsMock.commentsCount()).thenReturn(commentsCount);
            //When
            List<String> theListOf0User = statistics.statisticsData.usersNames();
            usersCount = theListOf0User.size();
            //Then
            assertEquals(0, theListOf0User.size());
        }

        @DisplayName("Test when users quantity are 100")
        @Test
        public void testCalculateAdvStatisticsWhenUsersQuantityAre100() {
            //Given
            List<String> resultList100OfUserName = generateNUsers(100);
            when(statisticsMock.usersNames()).thenReturn(resultList100OfUserName);
            //When
            List<String> the100OfUserList = statistics.statisticsData.usersNames();
            //Then
            assertEquals(resultList100OfUserName.size(), the100OfUserList.size());
        }
    }

    public List<String> generateNUsers(int users) {
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 1; i <= users; i++) {
            String username = "User name" + i;
            listOfUsers.add(username);
        }
        return listOfUsers;
    }

    public int generateNPosts(int posts) {
        if (posts != 0) {
            return posts;
        }
        return 0;
    }

    public int generateNComments(int comments) {
        if (comments != 0) {
            return comments;
        }
        return 0;
    }
}



