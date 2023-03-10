package com.springboot.backend;

import com.springboot.backend.entity.Student;
import com.springboot.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student();
//		student1.setFirstName("deepak");
//		student1.setLastName("saud");
//		student1.setEmail("deppsaud@gmail.com");
//		studentRepository.save(student1);

//		Student student2 = new Student();
//		student2.setFirstName("binod");
//		student2.setLastName("pandey");
//		student2.setEmail("binodpandey@gmail.com");
//		studentRepository.save(student2);


	}
}
