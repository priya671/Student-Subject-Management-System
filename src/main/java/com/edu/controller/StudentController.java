package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Student;
import com.edu.error.GlobalException;
import com.edu.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student stu = studentService.createStudent(student);
		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() throws GlobalException {
		return studentService.getAllStudents();
	}
	

}
