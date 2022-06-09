package com.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springdatajpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
