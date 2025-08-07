package com.example.services;

import java.util.List;

import com.example.entites.Student;

public interface IStudentService {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer id);
}
