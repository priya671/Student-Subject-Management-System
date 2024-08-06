package com.edu.service;

import java.util.List;

import com.edu.dao.Subject;
import com.edu.error.GlobalException;

public interface SubjectService {

	Subject saveSubject(Subject subject);

	List<Subject> getAllSubjects() throws GlobalException;

	Subject studentAssignSubject(Integer studentid, Integer subjectid) throws GlobalException;

}
