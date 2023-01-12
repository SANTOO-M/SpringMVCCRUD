package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.RegistrationService;

@Controller
public class MVCController { 
	
	@Autowired
	private RegistrationService ser;

	public MVCController() {
		System.out.println("Front-Controller invoked");
	}

	@RequestMapping(value="/")
	public String homePage() {
		return "Registration.jsp";
	}	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView registerForm(Student s) {
		ser.studentRegistrationService(s);
		return new ModelAndView("success.jsp").addObject("success","Record Successfully Inserted");
	}
	
	@RequestMapping(value="/viewAllStudents")
	public ModelAndView ViewStudents() {
		List<Student> allStudents=ser.viewAllStudentsService();
		/*
		 * for(int i=0;i<allStudents.size();i++) {
		 * System.out.println(allStudents.get(i).getsId()+"\t"+allStudents.get(i).
		 * getsName()
		 * +"\t"+allStudents.get(i).getsAge()+"\t"+allStudents.get(i).getsAddress()
		 * +"\t"+allStudents.get(i).getsCourse()); }
		 */
		return new ModelAndView("AllStudents.jsp").addObject("Students",allStudents);
		
	}
	
}
