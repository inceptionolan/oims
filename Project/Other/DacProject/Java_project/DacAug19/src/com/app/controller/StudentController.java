package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.IStudentDao;
import com.app.pojos.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	IStudentDao stdDao;
	
	@PostMapping("/register")
	public Integer register(@RequestBody Student std)
	{
		System.out.println(std);
		return stdDao.registerStudent(std);
	}
}
