package com.edu.service;

import java.util.List;

import com.edu.dao.Student;
import com.edu.error.GlobalException;

public interface StudentService {

	Student createStudent(Student student);

	List<Student> getAllStudents() throws GlobalException;

}
