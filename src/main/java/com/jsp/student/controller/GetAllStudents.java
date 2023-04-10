package com.jsp.student.controller;

import com.jsp.student.service.StudentService;

public class GetAllStudents {

	public static void main(String[] args) {

		StudentService studentService = new StudentService();
		studentService.getAllStudents();

	}
}
