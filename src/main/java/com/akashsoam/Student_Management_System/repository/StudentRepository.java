package com.akashsoam.Student_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akashsoam.Student_Management_System.entity.Student;

//JpaRepository<entity class, primary key type>
public interface StudentRepository extends JpaRepository<Student, Long> {

}
