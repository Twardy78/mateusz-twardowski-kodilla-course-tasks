package com.kodilla.stream.portfolio;

import java.util.*;

public class Board {

    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }
    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }
    public boolean removeTaskList(TaskList taskList) {
        return taskLists.remove(taskList);
    }

    public List<TaskList> getTaskLists() {
        return taskLists;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" +
                "taskLists=" + taskLists +
                ", name='" + name + '\'' +
                '}';
    }
}
