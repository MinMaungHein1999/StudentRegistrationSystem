package com.example.dao;

import com.example.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private static Student[] studentDB;
	
	public StudentDaoImpl() {
		studentDB = new Student[Student.maxStudentCount];
	}

	@Override
	public void addStudent(Student student) {
		studentDB[Student.getStudentCount()] = student;
	}

	@Override
	public Student getStudentById(int id) {
		for(int i=0; i< Student.getStudentCount(); i++) {
			if(studentDB[i].getId() == id) {
				return studentDB[i];
			}
		}
		return null;
	}

	@Override
	public Student getStudentByName(String name) {
		for(int i=0; i< Student.getStudentCount(); i++) {
			if(studentDB[i].getName().equalsIgnoreCase(name)) {
				return studentDB[i];
			}
		}
		return null;
	}

	@Override
	public Student[] getAllStudents() {
		return studentDB;
	}

	@Override
	public void updateStudent(Student student) {
		Student oldStu = this.getStudentById(student.getId());
		oldStu.setName(student.getName());
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}
}
