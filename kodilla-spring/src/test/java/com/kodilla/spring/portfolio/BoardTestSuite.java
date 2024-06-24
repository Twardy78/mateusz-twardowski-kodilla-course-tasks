package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        //When
        board.addTaskToDoList("Replace rear glass.");
        board.addTaskToDoList("Replace rear tires.");
        board.addTaskToDoList("Install new front lights.");
        board.addTaskInProgress("Paint front bumper.");
        board.addTaskInProgress("Repair the clutch hydraulic pump.");
        board.addTaskDone("Replace front braking disks.");
        int toDoTaskListSize = board.getToDoList().getTasks().size();
        int inProgressListSize = board.getInProgressList().getTasks().size();
        int doneListSize = board.getDoneList().getTasks().size();
        System.out.println("Task list size: " + toDoTaskListSize);
        System.out.println("Task list size: " + inProgressListSize);
        System.out.println("Task list size: " + doneListSize);
       //Then
        assertEquals(3, toDoTaskListSize);
        assertEquals(2, inProgressListSize);
        assertEquals(1, doneListSize);
    }
}
