package com.kodilla.hibernate.tasklist;

import jakarta.persistence.*;

@Entity
@Table(name = "Task list")
public class TaskList {

    private int id;
    private String listName;
    private String description;

    public TaskList(){
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false, unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "LIST NAME", nullable = false)
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
