package com.shivam.crudoperation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.shivam.crudoperation.entity.Employee;
import com.shivam.crudoperation.service.EmpService;

@RestController
public class FirstController {
	
	@Autowired
	EmpService emps;
	
	//create
	@PostMapping(path = "input")
	public void empData(@RequestBody Employee emp) {
		emps.createEmployee(emp);
	}
	
	@PostMapping(path = "input-all")
	public void saveAllEmp(@RequestBody List<Employee> list){
		emps.saveEmployees(list);
	}
	
	//read
	@GetMapping(path = "read")
	public Employee getEmpById(@RequestParam(name = "id") int id) {
		return emps.getEmp(id);
	}
	
	@GetMapping(path = "read-all")
	public List<Employee> getAllEmp() {
		return emps.getAllEmployees();
	}
	
	
	//update
	@PutMapping(path = "update")
	public void updateEmployee(@RequestBody Employee emp,@RequestParam(name = "id") int id) {
		emps.updateEmployeeData(emp, id);
	}
	
	//delete
	@DeleteMapping(path = "delete")
	public void deleteEmployeeById(@RequestParam(name = "id") int id) {
		emps.deleteEmployee(id);
	}
}
