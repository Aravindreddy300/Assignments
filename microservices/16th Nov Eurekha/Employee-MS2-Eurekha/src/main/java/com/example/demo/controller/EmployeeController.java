package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@GetMapping(path = "/employees", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Employee> viewEmployeeList() {
		List<Employee> listemployees = service.listAll();
		return listemployees;
	}
	
	@GetMapping("/employees/{pid}")
	public Optional<Employee> findByEmployee(@PathVariable int pid) {
		return service.getEmployee(pid);
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@Validated @RequestBody Employee newEmployee) {
		return service.createEmployee(newEmployee);
	}
	
	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id")Integer employeeId){
		return service.deleteEmployee(employeeId);
	}
	
	@PutMapping("/employees/{id}")
	public String updateEmployee(@PathVariable(value="id") Integer id, @Validated @RequestBody Employee newEmployee) {
		return service.updateEmployee(id, newEmployee);
	}
}
