package com.akashsoam.Student_Management_System.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akashsoam.Student_Management_System.entity.Student;
import com.akashsoam.Student_Management_System.repository.StudentRepository;
import com.akashsoam.Student_Management_System.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    // public StudentServiceImpl() {
    // // super();
    // }

    public StudentServiceImpl(StudentRepository studentRepository) {
        // super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getAllStudents'");
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'savStudent'");
        return studentRepository.save(student);

    }

}
