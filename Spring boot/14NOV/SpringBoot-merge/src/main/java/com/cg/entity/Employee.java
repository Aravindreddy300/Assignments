package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employ_merge")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
		public Employee() {
		super();
	}
		public Employee(Long id, String company) {
		super();
		this.id = id;
		this.company = company;
	}
		String  company;
	
	
	
	

}
