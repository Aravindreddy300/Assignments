package com.cg.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="departmet_bi")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int d_id;
	private String d_name;
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	private List<Employee> employees =new ArrayList<Employee>();
	public Department() {
		super();
	}
	public Department(int d_id, String d_name) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}	
	
	
}
