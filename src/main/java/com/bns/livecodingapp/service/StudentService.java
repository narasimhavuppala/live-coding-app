package com.bns.livecodingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bns.livecodingapp.model.Student;
import com.bns.livecodingapp.repository.StudentRepository;

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
