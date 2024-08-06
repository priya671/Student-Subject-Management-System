package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.edu.dao.Student;
import com.edu.error.GlobalException;
import com.edu.repository.StudentRepository;
import com.edu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() throws GlobalException{
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
