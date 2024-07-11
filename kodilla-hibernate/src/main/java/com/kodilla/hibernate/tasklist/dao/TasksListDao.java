package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TasksList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Repository
@Transactional
public interface TasksListDao extends CrudRepository<TasksList, Integer> {
        List<TasksList> findByListName(String listName);
}
