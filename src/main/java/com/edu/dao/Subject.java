package com.edu.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectid;
	
	@Column(unique = true)
	private String subjectname;
	
	
	@ManyToOne()
	@JoinColumn(name = "studentid", referencedColumnName = "studentid")
	Student student;
	
	public void studentAssignSubject(Student sob) {
		this.student = sob;
	}

	
	public void subjectAssignedStudent(Student sub) {
		this.student = sub;
	}
}
