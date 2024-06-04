package com.akashsoam.Student_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akashsoam.Student_Management_System.entity.Student;

//JpaRepository<entity class, primary key type>
// @Repository// not necessary as JpaRepository already has this annotation
public interface StudentRepository extends JpaRepository<Student, Long> {

}
