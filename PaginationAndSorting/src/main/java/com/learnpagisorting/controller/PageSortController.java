package com.learnpagisorting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learnpagisorting.model.Student;
import com.learnpagisorting.serviceinterface.StudentService;

@RestController
@RequestMapping
public class PageSortController {
	@Autowired
	private StudentService service;
	
	@GetMapping(value="/getAllStudent")
	public  ResponseEntity<List<Student>> getAllStudent(
			@RequestParam(value="pageNumber", defaultValue="0",required=false)Integer pageNumber,
			@RequestParam(value="pageSize", defaultValue="3",required=false)Integer pageSize	)
	{
		List<Student> allstudent =this.service.getAllStudent(pageNumber, pageSize);
		
		return ResponseEntity.ok(allstudent);
	}
	@GetMapping(value="/getAllStudents")
	public  ResponseEntity<List<Student>> getAllStudents(
			@RequestParam(value="pageNumber", defaultValue="0",required=false)Integer pageNumber,
			@RequestParam(value="pageSize", defaultValue="3",required=false)Integer pageSize	)
	{
		List<Student> allstudent =this.service.getAllStudent(pageNumber, pageSize);
		
		return ResponseEntity.ok(allstudent);
	}
}
