package com.example.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.exception.EmployeeNotFoundException;
import com.example.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee editEmployee(Employee employee) throws EmployeeNotFoundException
	{
		Employee e = employeeRepository.findById(employee.getId()).orElse(null);
		if(e != null)
		{
			return employeeRepository.save(employee);
		}
		
			throw new EmployeeNotFoundException("Employee Not Found");
	}
	
	public Employee addEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public String deleteEmployee(int id)
	{
		employeeRepository.deleteById(id);
		return "Employee Deleted";
	}
}
