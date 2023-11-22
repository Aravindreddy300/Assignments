package com.cg;

import java.util.ArrayList;
import java.util.List;

import com.cg.entity.Department;
import com.cg.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Department dept=new Department();
		dept.setD_name("HR");
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		dept.setEmployees(list);
		em.persist(dept);
		em.getTransaction().commit();
		em.getTransaction().begin();
		Employee u = em.find(Employee.class, 1);

	}

}
