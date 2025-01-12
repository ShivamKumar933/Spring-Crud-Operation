package com.shivam.crudoperation.service;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.crudoperation.entity.Employee;
import com.shivam.crudoperation.repositories.EmployeeRepo;

@Service
public class EmpService {
	@Autowired
	EmployeeRepo empr;
	
	public void createEmployee(Employee employee) {
		empr.save(employee);
	}

	public Employee getEmp(int val) {
		return empr.findById(val).get();
	}

	public void saveEmployees(List<Employee> list) {
		empr.saveAll(list);
	}

	public void updateEmployeeData(Employee emp, int val) {
		Employee empToUpdate = getEmp(val);
		empToUpdate.setName(emp.getName());
		
		empr.save(empToUpdate);
	}

	public List<Employee> getAllEmployees() {
		return empr.findAll();
	}

	public void deleteEmployee(int id) {
		empr.deleteById(id);
	}
}
