package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    TaskList toDoList;
    @Autowired
    TaskList inProgressList;
    @Autowired
    TaskList doneList;

    @Bean
    public Board getBoard() {
         return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList doneList() {
        return new TaskList();
    }
}