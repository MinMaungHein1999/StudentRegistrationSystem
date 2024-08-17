package com.example.model;

import java.util.HashMap;

public class Exam {
	private static int maxExamCount = 1000;
	private String title;
	private HashMap<Subject, Integer> subjectMarks = new HashMap<>();
	private Student student;
	
	public Exam(String title) {
		this.title = title;
	}
	
	public void addSubject(Subject subject, int mark) {
		this.subjectMarks.put(subject, mark);
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public static int getMaxExamCount() {
		return maxExamCount;
	}
}
