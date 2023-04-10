package com.jsp.student.controller;

import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;

public class GetByIdStudent {

	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		Student student = studentService.getByIdStudent(1);
		if (student != null) {
			System.out.println("Student ID: " + student.getId());
			System.out.println("Student ID: " + student.getName());
			System.out.println("Student ID: " + student.getEmail());
			System.out.println("Student ID: " + student.getCno());
			System.out.println("Student ID: " + student.getStatus());
		}

	}
}
