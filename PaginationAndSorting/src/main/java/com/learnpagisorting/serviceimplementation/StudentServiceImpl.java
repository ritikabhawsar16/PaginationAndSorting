package com.learnpagisorting.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.TypedSort;
import org.springframework.stereotype.Service;

import com.learnpagisorting.model.Student;
import com.learnpagisorting.repository.StudentRepository;
import com.learnpagisorting.serviceinterface.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudent(Integer pageNumber, Integer pageSize) {

		//	int pageSize=5;
		//	int pageNumber=1;
		PageRequest p=PageRequest.of(pageNumber , pageSize, Sort.by("id").ascending());
		Page<Student> page = studentRepo.findAll(p);

		System.out.println(page.getContent().get(0));

		List<Student> allstudent= page.getContent();
		//	  
		return allstudent;
	}





}
