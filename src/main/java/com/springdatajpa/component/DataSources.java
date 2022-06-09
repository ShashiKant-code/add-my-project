package com.springdatajpa.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springdatajpa.model.Employee;
import com.springdatajpa.repository.EmployeeRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



@Component
public class DataSources {

    @Autowired
    private EmployeeRepository repo;
    
    

    public void run() {
    	
        List<Employee> employees = createEmployees();

        System.out.println(" -- saving employees ------------------------------------");
        System.out.println(employees);
        repo.saveAll(employees);

        System.out.println(" -- finding all employees -----------------------------");
        Iterable<Employee> all = repo.findAll();
        System.out.println(all);
    }
    

    private List<Employee> createEmployees() {
        return Arrays.asList(
                Employee.create("Diana", "Admin"),
                Employee.create("Mike", "Sale"),
                Employee.create("Rose", "IT"),
                Employee.create("Sun", "Trainer"),
                Employee.create("Ora", "Lead"),
                Employee.create("Kathy", "Manager")
        );

    }
    
}



