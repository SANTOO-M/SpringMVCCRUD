package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class RegistrationDAO {
	
	@Autowired
	private SessionFactory fact;
	
	public RegistrationDAO() {
		System.out.println("Registration DAO created");
	}
	
	public void studentRegistrationDAO(Student s) {
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		System.out.println("Successfully Saved");
	}
}
