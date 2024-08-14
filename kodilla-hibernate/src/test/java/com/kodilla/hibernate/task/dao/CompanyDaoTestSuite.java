package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

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
}
