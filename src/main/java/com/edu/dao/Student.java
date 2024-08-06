package com.edu.dao;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentid;
	
	private String studentname;
	
	private String studentaddress;
	
	@OneToMany(mappedBy = "student")
	Set<Subject> sob = new HashSet<Subject>();
	

}
