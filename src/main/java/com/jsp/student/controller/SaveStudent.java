package com.jsp.student.controller;

import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;

public class SaveStudent {

	public static void main(String[] args) {

		Student student = new Student();
		student.setName("xyz");
		student.setEmail("xyz@mail.com");
		student.setCno(4455662233L);
		student.setStatus("approved");

		StudentService studentService = new StudentService();
		Student student2 = studentService.saveStudent(student);
		if (student2 != null)
			System.out.println(student2.getName() + " added to database");
	}
}
