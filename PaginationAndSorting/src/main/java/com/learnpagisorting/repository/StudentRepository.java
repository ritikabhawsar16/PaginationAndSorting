package com.learnpagisorting.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learnpagisorting.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	// GET ALL
	@Query(value = "FROM Student")
	List<Student> getAllStudent(PageRequest p);
	
	@Query(value="select * from student_table1 limit 5", nativeQuery = true)
	List<Student> getAllStudentWithLimit();
}
