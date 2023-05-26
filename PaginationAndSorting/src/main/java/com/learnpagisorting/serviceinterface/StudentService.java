package com.learnpagisorting.serviceinterface;

import java.util.List;

import com.learnpagisorting.model.Student;

public interface StudentService {

	List<Student> getAllStudent(Integer pageNumber, Integer pageSize);

}
