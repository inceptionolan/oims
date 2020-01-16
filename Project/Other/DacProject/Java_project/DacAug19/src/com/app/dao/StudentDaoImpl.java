package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Student;
@Service
@Transactional
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public Integer registerStudent(Student std) 
	{
		return (Integer) sf.getCurrentSession().save(std);
	}
	
}
