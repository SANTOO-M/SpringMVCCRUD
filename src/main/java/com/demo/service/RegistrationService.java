package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.RegistrationDAO;
import com.demo.model.Student;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationDAO dao;
	
	public RegistrationService() {
		System.out.println("RegistrationService Object Created");
	}
	
	public void studentRegistrationService(Student s) {
		dao.studentRegistrationDAO(s);
	}
}
