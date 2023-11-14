package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class Student extends Person {
	@Column(name="schoolName")
	private String schoolName;
	@Column(name="sectionName")
	private String sectionName;
	@Column(name="fee")
	private int fee;
	
	public Student() {
		super();
	}
	public Student(String schoolName, String sectionName, int fee) {
		super();
		this.schoolName = schoolName;
		this.sectionName = sectionName;
		this.fee = fee;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	

}
