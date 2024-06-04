package com.akashsoam.Student_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akashsoam.Student_Management_System.entity.Student;
import com.akashsoam.Student_Management_System.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		/******************************************************** */
		// Student student1 = new Student("Akash", "Soam", "soamakash0@gmail.com");
		// studentRepository.save(student1);

		// Student student2 = new Student("Modi", "Bhayy", "nm@gmail.com");
		// studentRepository.save(student2);

		// Student student3 = new Student("Nitesh", "Kumar", "impact.player@gmail.com");
		// studentRepository.save(student3);
	}

}
