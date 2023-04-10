package com.jsp.student.controller;

import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;

public class UpdateStudent {

	public static void main(String[] args) {

		Student student = new Student();
		student.setName("saloni");
		student.setEmail("saloni@mail.com");
		student.setCno(7788552233L);

		StudentService studentService = new StudentService();
		Student student2 = studentService.updateStudent(student, 5);
		if (student2 != null)
			System.out.println("Student Record Updated");
	}
}
