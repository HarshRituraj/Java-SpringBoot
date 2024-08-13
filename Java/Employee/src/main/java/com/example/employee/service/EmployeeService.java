package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.exception.EmployeeNotFoundException;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee addEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException
	{
		Employee e = employeeRepository.findById(employee.getId()).orElse(null);
		if(e != null)
		{
			return employeeRepository.save(employee);
		}
		else
		{
			throw new EmployeeNotFoundException("Employee not found");
		}
	}
	
	public String deleteEmployee(long id) throws EmployeeNotFoundException
	{
		Employee e = employeeRepository.findById(id).orElse(null);
		if(e != null)
		{
			employeeRepository.deleteById(id);
			return "Employee Deleted";
		}
		else
		{
			throw new EmployeeNotFoundException("Employee not found");
		}
	}
}

