package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.dao.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
