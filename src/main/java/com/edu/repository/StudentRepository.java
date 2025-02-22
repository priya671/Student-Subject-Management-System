package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.dao.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
