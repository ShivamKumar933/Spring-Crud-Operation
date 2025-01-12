package com.shivam.crudoperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.crudoperation.entity.Employee;
import com.shivam.curdoperation.repositories.EmployeeRepo;

@Service
public class EmpService {
	@Autowired
	EmployeeRepo empr;
	
	public void createEmployee(Employee employee) {
		empr.save(employee);
	}
}
