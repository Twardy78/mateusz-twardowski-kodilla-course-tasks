package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> findByPrefix (@Param("PREFIX") String prefix);

    @Query("FROM Company WHERE name LIKE %:COMPANYNAMEFRAGMENT%")
    List<Company> findByCompanyNamefragment(@Param("COMPANYNAMEFRAGMENT") String fragment);
}