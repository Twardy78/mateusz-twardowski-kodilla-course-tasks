package com.kodilla.hibernate.taklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    private static final String SHOPPING = "Shopping List";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(SHOPPING, "Buy vegetables and fruits");

        //When
        taskListDao.save(taskList);

        //Then
        int taskListId = taskList.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(taskListId);
        assertTrue(readTaskList.isPresent());

        //Clean up
        taskListDao.deleteById(taskListId);
    }

}
