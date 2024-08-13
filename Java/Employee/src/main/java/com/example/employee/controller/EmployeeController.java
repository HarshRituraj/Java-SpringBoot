package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.exception.EmployeeNotFoundException;
import com.example.employee.service.EmployeeService;

@CrossOrigin
@RestController 
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/add-employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/update-employee")
	public Employee updateEmployee(@RequestBody Employee employee) throws EmployeeNotFoundException
	{
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete-employee")
	public String deleteEmployee(@RequestParam("id") long id) throws EmployeeNotFoundException
	{
		return employeeService.deleteEmployee(id);
	}
}
