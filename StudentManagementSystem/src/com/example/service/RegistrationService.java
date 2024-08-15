package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Student;

public abstract class RegistrationService {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static final int maxStudentCount = 1000;
	private static Student[] students= new Student[maxStudentCount];
	private Student student;
	
	public RegistrationService() throws IOException {
		this.getStudentInformation();
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
		students[Student.getStudentCount()-1] = this.student;
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
			System.out.println(students[i]);
		}
		System.out.println("Students Count : " + Student.getStudentCount());
		System.out.println("International Students Count : " + Student.getInterStudentCount());
		System.out.println("Regular Students Count : " + Student.getRegularStudentCount());
	}
}
