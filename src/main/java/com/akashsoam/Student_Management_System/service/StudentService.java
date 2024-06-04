package com.akashsoam.Student_Management_System.service;

import com.akashsoam.Student_Management_System.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
