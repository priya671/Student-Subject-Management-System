package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Subject;
import com.edu.error.GlobalException;
import com.edu.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("/saveSubject")
	public ResponseEntity<Subject> saveSubject(@RequestBody Subject subject) {
		Subject sub = subjectService.saveSubject(subject);
		return new ResponseEntity<Subject>(sub, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllSubjects")
	public List<Subject> getAllSubjects() throws GlobalException{
		return subjectService.getAllSubjects();
	}
	
	@GetMapping("/studentAssignSubject/student/{studentid}/subject/{subjectid}")
	public Subject studentAssignSubject(@PathVariable Integer studentid, @PathVariable Integer subjectid) throws GlobalException {
		return subjectService.studentAssignSubject(studentid, subjectid);
	}

}
