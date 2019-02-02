package com.bns.livecodingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bns.livecodingapp.model.Student;

@RestController("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping
	public Student SaveStudent(Student obj) {
		return studentService.saveStudent(obj);
	}

}
