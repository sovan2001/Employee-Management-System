package com.ems.version001.repository;

import org.springframework.data.repository.CrudRepository;

import com.ems.version001.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
