package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_table")

public class Employee extends Person{
	
	@Column(name="salary")
	private int salary;
	@Column(name="deptName")
	private String deptName;
	@Column(name="bonus")
	private int bonus;
	@Column(name="email")
	private String email;
	
	public Employee() {
		super();
	}
	public Employee(int salary, String deptName, int bonus, String email) {
		super();
		this.salary = salary;
		this.deptName = deptName;
		this.bonus = bonus;
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
