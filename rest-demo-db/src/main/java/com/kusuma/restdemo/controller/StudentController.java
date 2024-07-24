package com.kusuma.restdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kusuma.restdemo.model.Student;

@RestController
public class StudentController {
	
	@PostMapping("/students")
	public void createStudent(@RequestBody Student student) {
		System.out.println(student);
		System.out.println("Student created successfully");
	}

}
