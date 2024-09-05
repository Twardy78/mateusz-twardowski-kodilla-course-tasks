package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMeasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMeasters.getEmployees().add(stephanieClarckson);
        dataMeasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMeasters);
        lindaKovalsky.getCompanies().add(dataMeasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineID = softwareMachine.getId();
        companyDao.save(dataMeasters);
        int dataMeastersID = dataMeasters.getId();
        companyDao.save(greyMatter);
        int greyMatterID = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineID);
        assertNotEquals(0, dataMeastersID);
        assertNotEquals(0, greyMatterID);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineID);
            companyDao.deleteById(dataMeastersID);
            companyDao.deleteById(greyMatterID);
        }catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void testFindByLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee bobSmith = new Employee("Bob", "Smith");
        Employee jennySmith = new Employee("Jenny", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(jennySmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(bobSmith);
        employeeDao.save(johnSmith);

        //When
        List<Employee> employeesID = employeeDao.findByLastName("Smith");
        int employeesListSize = employeesID.size();

        //Then
        assertEquals(3,employeesListSize);

        //Clean up
        employeeDao.delete(jennySmith);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaKovalsky);
        employeeDao.delete(bobSmith);
        employeeDao.delete(johnSmith);
    }

    @Test
    void testFindByPrefix() {
        //Given
        String prefix = "Med";
        Company mediaBox = new Company("Media Box");
        Company mediaBeskid = new Company("Media Besid");
        Company mediaMarine = new Company("Media Marine");
        Company polsat = new Company("Polsat");
        Company tvn = new Company("TVN");
        Company stopklatka = new Company("Stopklatka");

       companyDao.save(mediaBox);
       companyDao.save(mediaBeskid);
       companyDao.save(mediaMarine);
       companyDao.save(polsat);
       companyDao.save(tvn);
       companyDao.save(stopklatka);

        //When
        List<Company> companiesID = companyDao.findByPrefix(prefix);
        int companiesListSize = companiesID.size();

        //Then
        assertEquals(3,companiesListSize);
        assertTrue(companiesID.stream().allMatch(c -> c.getName().startsWith(prefix)));

        //Clean up
        companyDao.deleteAll();

    }

}
