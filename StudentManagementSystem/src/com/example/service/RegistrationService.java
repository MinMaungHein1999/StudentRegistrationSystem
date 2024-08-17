package com.example.service;

import java.io.IOException;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.model.Student;

public abstract class RegistrationService extends BaseService{
	
	private StudentDao studentDao;
	private Student student;
	
	public RegistrationService() throws IOException {
		this.getStudentInformation();
		this.studentDao = new StudentDaoImpl();
	}
	
	public void getStudentInformation() throws IOException{
		System.out.print("Enter Name : ");
		String name = br.readLine();
		System.out.print("Enter Age : ");
		int age = Integer.parseInt(br.readLine());
		
		this.student = new Student(name, age);
		this.getTypeInfo();
		this.addNewStudent();
	}
	
	public abstract void getTypeInfo() throws IOException;
	
	public void addNewStudent() {
		this.studentDao.addStudent(this.student);
	}
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void displayStudents() {
		System.out.println("******** Students Information *****");
		for(int i=0; i<Student.getStudentCount(); i++) {
			System.out.println(this.studentDao.getStudentById(i+1));
		}
		System.out.println("Students Count : " + Student.getStudentCount());
		System.out.println("International Students Count : " + Student.getInterStudentCount());
		System.out.println("Regular Students Count : " + Student.getRegularStudentCount());
	}

}
