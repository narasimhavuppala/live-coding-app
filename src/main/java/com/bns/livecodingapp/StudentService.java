package com.bns.livecodingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bns.livecodingapp.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student entity) {
		return studentRepository.save(entity);
	}

}
