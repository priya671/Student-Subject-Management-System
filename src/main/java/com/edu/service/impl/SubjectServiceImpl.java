package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.Student;
import com.edu.dao.Subject;
import com.edu.repository.StudentRepository;
import com.edu.repository.SubjectRepository;
import com.edu.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Subject saveSubject(Subject subject) {
		// TODO Auto-generated method stub
		return subjectRepository.save(subject);
	}

	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}

	@Override
	public Subject studentAssignSubject(Integer studentid, Integer subjectid) {
		// TODO Auto-generated method stub
		Subject sub = subjectRepository.findById(subjectid).get();
		Student stu = studentRepository.findById(studentid).get();
		sub.studentAssignSubject(stu);;
		return subjectRepository.save(sub);
	}

}
