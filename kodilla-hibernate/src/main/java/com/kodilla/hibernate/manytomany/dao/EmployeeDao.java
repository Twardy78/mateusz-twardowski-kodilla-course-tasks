package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Long> {

    @Query
    List<Employee> findByLastName(@Param("LASTNAME") String lastName);

    @Query("FROM Employee WHERE lastname LIKE %:EMPLOYEENAMEFRAGMENT%")
    List<Employee> findByEmployeeLastNameFragment(@Param("EMPLOYEENAMEFRAGMENT") String fragment);
}
