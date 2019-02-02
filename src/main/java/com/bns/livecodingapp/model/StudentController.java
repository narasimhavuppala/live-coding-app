package com.bns.livecodingapp.model;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student SaveStudent(@RequestBody @Valid Student obj) {
		System.out.println(obj.getGrade());
		return studentService.saveStudent(obj);
	}
	@GetMapping(produces=MediaType.APPLICATION_XML_VALUE)
	public List<Student> getAllStudents(){
		return studentService.getAllStduentd();
	}

}
