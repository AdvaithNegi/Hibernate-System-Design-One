package com.jsp.student.controller;

import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;

public class DeleteStudent {

	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		Student student = studentService.deleteStudent(6);
		if (student != null)
			System.out.println("Student Record Deleted");
	}
}
