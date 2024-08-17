package com.example.model;

public class Student {
	
	public static final int maxStudentCount = 1000;
	private int id;
	private String name;
	private int age;
	private boolean isRegular;
	private static int studentCount = 0; 
	private static int interStudentCount = 0;
	private static int regularStudentCount = 0;
	private Exam exam;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student(Student student, Boolean type) {
		this.name = student.name;
		this.age = student.age;
		this.isRegular = type;
		studentCount++;
		this.id = studentCount;
		if(type) {
			regularStudentCount++;
		}else {
			interStudentCount++;
		}
	}

	public static int getStudentCount() {
		return studentCount;
	}

	@Override
	public String toString() {
		return "\n id : " + id + "\n name : " + name + "\n age=" + age + "\n isRegular=" + isRegular ;
	}

	public static int getInterStudentCount() {
		return interStudentCount;
	}

	public static void setInterStudentCount(int interStudentCount) {
		Student.interStudentCount = interStudentCount;
	}

	public static int getRegularStudentCount() {
		return regularStudentCount;
	}

	public static void setRegularStudentCount(int regularStudentCount) {
		Student.regularStudentCount = regularStudentCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
