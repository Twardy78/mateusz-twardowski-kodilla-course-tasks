package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TasksList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TasksListDaoTestSuite {

    private static final String SHOPPING = "Shopping List";

    @Autowired
    private TasksListDao tasksListDao;

    @Test
    public void testFindByListName() {
        //Given
        TasksList taskList = new TasksList(SHOPPING, "Buy vegetables and fruits");

        //When
        tasksListDao.save(taskList);

        //Then
        int taskListId = taskList.getId();
        Optional<TasksList> readTasksList = tasksListDao.findById(taskListId);
        assertTrue(readTasksList.isPresent());

        //Clean up
        tasksListDao.deleteById(taskListId);
    }

}
