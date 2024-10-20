package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSiute {
//
//    @Test
//    public void testConnect() throws SQLException {
//        //Given
//        //When
//        DbManager dbManager = DbManager.getInstance();
//        //Then
//        assertNotNull(dbManager.getConnection());
//    }
//
//    @Test
//    public void testSelectUser() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs= statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while (rs.next()) {
//            System.out.println(rs.getInt("ID") + ", " +
//                rs.getString("FIRSTNAME") + ", " +
//                rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        assertEquals(5, counter);
//    }
//
//    @Test
//    public void testSelectUsersAndTasks() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = """
//                SELECT U.FIRSTNAME, U.LASTNAME, I.SUMMARY
//                FROM USERS U
//                JOIN ISSUES I ON U.ID = I.USER_ID_ASSIGNEDTO
//                """;
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs= statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while (rs.next()) {
//            System.out.println(rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME") + ", " +
//                    rs.getString("SUMMARY"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        assertEquals(15, counter);
//    }
//
//    @Test
//    public void testSelectUsersAndPosts() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = """
//                SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_QTY
//                FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID
//                GROUP BY U.FIRSTNAME, U.LASTNAME
//                HAVING COUNT(*) >= 2
//                ORDER BY POSTS_QTY
//                """;
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs= statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while (rs.next()) {
//            System.out.println(rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME") + ", " +
//                    rs.getInt("POSTS_QTY"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        assertEquals(3, counter);
//    }
}
