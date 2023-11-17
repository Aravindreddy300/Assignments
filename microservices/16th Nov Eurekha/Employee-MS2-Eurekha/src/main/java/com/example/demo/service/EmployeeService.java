package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service

public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepo;

	public List<Employee> listAll() {
		return employeeRepo.findAll();
	}
	
	
	public Optional<Employee> getEmployee(int id){
		Optional<Employee> p=employeeRepo.findById(id);
		return p;
	}
	
	public Employee createEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public Map<String,Boolean> deleteEmployee(Integer employeeId){
		employeeRepo.deleteById(employeeId);
		Map<String,Boolean> response=new HashMap();
		response.put("employee has been deleted", Boolean.TRUE);
		return response;
	}
	
	public String updateEmployee(Integer employeeId, Employee newEmployee) {
		Optional<Employee> existingEmployee = employeeRepo.findById(employeeId);
		if(existingEmployee.isPresent()) {
			Employee foundEmployee = existingEmployee.get();
			foundEmployee.seteName(newEmployee.geteName());
			foundEmployee.seteSalary(newEmployee.geteSalary());
			employeeRepo.save(foundEmployee);
 
			return "employee Updated";
		}
		return "employee Not Updated";

	}
	

}
