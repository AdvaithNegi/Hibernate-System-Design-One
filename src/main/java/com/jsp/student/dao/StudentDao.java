package com.jsp.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.student.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Save Record
	public Student saveStudent(Student student) {

		if (student != null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			return student;
		} else
			return null;
	}

	// Get BY ID Student

	public Student getByIdStudent(int id) {
		return entityManager.find(Student.class, id);

	}

	// Update Student
	public Student updateStudent(Student student) {
		if (student != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		} else
			return null;
	}

	// Delete Student
	public Student deleteStudent(Student student) {
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return student;
		} else
			return null;
	}

	// Get All Students
	public void getAllStudents() {
		String sql = "select s from Student s";
		Query query = entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println("===============================================");
			System.out.println("Student ID     : " + student.getId());
			System.out.println("Student Name   : " + student.getName());
			System.out.println("Student Email  : " + student.getEmail());
			System.out.println("Student CNo    : " + student.getCno());
			System.out.println("Student Status : " + student.getStatus());
		}
	}

}
