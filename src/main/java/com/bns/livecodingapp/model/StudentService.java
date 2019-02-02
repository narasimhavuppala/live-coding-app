package com.bns.livecodingapp.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student entity) {
		return studentRepository.save(entity);
	}
	
	public List<Student> getAllStduentd() {
		return studentRepository.findAll();
	}

}
