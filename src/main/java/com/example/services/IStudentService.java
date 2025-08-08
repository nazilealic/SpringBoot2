package com.example.services;

import java.util.List;

import com.example.dto.DtoStudent;
import com.example.dto.DtoStudentIU;
import com.example.entites.Student;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent upDateStudent(Integer id , DtoStudentIU dtoStudentIU);
	
}
