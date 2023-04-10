package com.jsp.student.service;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();

	// Save Student
	public Student saveStudent(Student student) {
		if (student != null) {
			student.setStatus("unapproved");
		}
		return studentDao.saveStudent(student);
	}

	// Get By Id Student
	public Student getByIdStudent(int id) {
		if (id > 0)
			return studentDao.getByIdStudent(id);
		return null;
	}

	// Update Student
	public Student updateStudent(Student student, int id) {
		Student student2 = studentDao.getByIdStudent(id);
		if (student.getName() != null)
			student2.setName(student.getName());
		if (student.getEmail() != null)
			student2.setEmail(student.getEmail());
		if (student.getCno() != 0)
			student2.setCno(student.getCno());

		if (student2 != null)
			return studentDao.updateStudent(student2);
		return null;
	}

	// Delete Student
	public Student deleteStudent(int id) {
		Student student = studentDao.getByIdStudent(id);
		if (student != null) {
			return studentDao.deleteStudent(student);
		}
		return null;
	}

	// Get All Student
	public void getAllStudents() {
		studentDao.getAllStudents();
	}

}
