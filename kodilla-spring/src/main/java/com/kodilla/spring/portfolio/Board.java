package com.kodilla.spring.portfolio;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList,final TaskList inProgressList,final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToDoList(final String task) {
        toDoList.addTask(task);
    }

    public void addTaskInProgress(final String task) {
        inProgressList.addTask(task);
    }

    public void addTaskDone(final String task) {
        doneList.addTask(task);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}

