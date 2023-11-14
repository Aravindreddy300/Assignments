package com.cg;

import java.math.BigDecimal;

import com.cg.entity.Employee;
import com.cg.entity.Person;
import com.cg.entity.Student;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;

public class SvaeDataClientTest {

	public static void main(String[] args) {
		
		EntityManager entityManager=JPAUtil.getEntityManagerFactory().createEntityManager();
		 
		Person p=new Person();
		p.setName("Aravind");
		p.setGender("Female");
		
		Employee e=new Employee();
		e.setBonus(250);
		e.setDeptName("IT");
		
		Student s=new Student();
		s.setName("Siva");
		s.setGender("Male");
		s.setFee(2000);
		s.setSchoolName("Capg");
		s.setSectionName("devops");
		
		entityManager.getTransaction().begin();
		entityManager.persist(p);
		entityManager.persist(e);
		entityManager.persist(s);
		entityManager.getTransaction().commit();
		entityManager.close();
		JPAUtil.shutdown();
		
		
		
		

	}

}
