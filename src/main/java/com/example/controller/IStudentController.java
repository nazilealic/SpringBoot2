package com.example.controller;

import java.util.List;

import com.example.entites.Student;

public interface IStudentController {

	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
