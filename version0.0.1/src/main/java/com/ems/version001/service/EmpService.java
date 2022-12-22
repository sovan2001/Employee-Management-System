package com.ems.version001.service;

import org.springframework.stereotype.Service;

import com.ems.version001.model.Employee;
import com.ems.version001.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmpService {

	private EmployeeRepository employeeRepository;	
	
	public EmpService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public void saveMyUser(Employee employee) {
		employeeRepository.save(employee);
	}
}
