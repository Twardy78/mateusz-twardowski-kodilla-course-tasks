package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SearchFacade {

    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    public SearchFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> findEmployee(String name) {
        return employeeDao.findByEmployeeLastNameFragment(name);
    }

    public List<Company> findCompany(String name) {
        return companyDao.findByCompanyNamefragment(name);
    }
}
