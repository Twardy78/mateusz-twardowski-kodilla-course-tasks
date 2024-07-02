package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    @DisplayName("Test Driving Task not executed yet")
    void testFactoryDrivingTaskNotExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.taskType(TaskFactory.DRIVING);
        //Then
        assertEquals("Pickup shopping", drivingTask.getTaskName());
        assertFalse(drivingTask.inTaskExecuted());
    }

    @Test
    void testFactoryDrivingTaskExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.taskType(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //Then
        assertTrue(drivingTask.inTaskExecuted());
    }

    @Test
    void testFactoryPaintingTaskNotExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.taskType(TaskFactory.PAINTING);
        //Then
        assertEquals("Repaint", paintingTask.getTaskName());
        assertFalse(paintingTask.inTaskExecuted());
    }

    @Test
    void testFactoryPaintingTaskExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.taskType(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        assertTrue(paintingTask.inTaskExecuted());
    }

    @Test
    void testFactoryShoppingTaskNotExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.taskType(TaskFactory.SHOPPING);
        //Then
        assertEquals("Buy vegetables", shoppingTask.getTaskName());
        assertFalse(shoppingTask.inTaskExecuted());
    }

    @Test
    void testFactoryShoppingTaskExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.taskType(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        assertTrue(shoppingTask.inTaskExecuted());
    }

}
