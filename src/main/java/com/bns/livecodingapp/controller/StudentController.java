package com.bns.livecodingapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bns.livecodingapp.model.Student;
import com.bns.livecodingapp.service.StudentService;

@RestController("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@Autowired
	JmsTemplate jmsTemplate;

	@PostMapping(value="v1",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student SaveStudent(@RequestBody @Valid Student obj) {
		System.out.println(obj.getGrade());
		jmsTemplate.convertAndSend("bns","Hello BNS Guys...POST Messages");
		return studentService.saveStudent(obj);
	}
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllStudents(){
		
		jmsTemplate.convertAndSend("bns","Hello BNS Guys...GET Message");
		return studentService.getAllStduentd();
	}

}
