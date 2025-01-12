package com.shivam.crudoperation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.crudoperation.entity.Employee;
import com.shivam.crudoperation.service.EmpService;

@RestController
public class FirstController {
	
	@Autowired
	EmpService emps;
	
	@PostMapping(path = "input")
	public void empData(@RequestBody Employee emp) {
		emps.createEmployee(emp);
	}
}
