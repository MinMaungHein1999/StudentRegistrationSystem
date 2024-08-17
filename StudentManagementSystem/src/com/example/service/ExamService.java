package com.example.service;

import java.io.IOException;

import com.example.dao.ExamDao;
import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.dao.SubjectDao;
import com.example.dao.SubjectDaoImpl;
import com.example.model.Exam;
import com.example.model.Student;
import com.example.model.Subject;

public class ExamService extends BaseService{
	private Exam exam;
	
	private StudentDao studentDao;
	private SubjectDao subjectDao;
	private ExamDao examDao;
	
	
	public ExamService() throws IOException {
		this.studentDao = new StudentDaoImpl();
		this.subjectDao = new SubjectDaoImpl();
	}
	
	
	public void create() throws IOException {
		System.out.println("*******Exam Create From*******");
		createExam();
		findStudentByName();
		selectSubjectsById();
		this.examDao.addExam(this.exam);
	}
	
	
	private void createExam() throws IOException {
		System.out.print("Enter Exam Titel : ");
		String title = br.readLine();
		this.exam = new Exam(title);
	}


	private void selectSubjectsById() throws IOException {
		System.out.println("*******Please Select Subject*******");
		
		displayAllSubjects();
		
		getEnrollSubject();
		
		System.out.print("Do you want to Enroll new subject (yes/no) ? ");
		String flag = br.readLine();
		if(flag.equalsIgnoreCase("yes")) {
			selectSubjectsById();
		}
	}
	
	
	private void getEnrollSubject() throws NumberFormatException, IOException {
		System.out.print("Enter Selected Subject Id : ");
		
		int id = Integer.parseInt(br.readLine());
		Subject subject = this.subjectDao.getSubjectById(id);
		
		if(subject==null) {
			System.out.println("Subject not found error!!!!");
			getEnrollSubject();
		}
		
		int mark = getMarkForSubject(subject);
		
		this.exam.addSubject(subject, mark);
	}


	private int getMarkForSubject(Subject subject) throws NumberFormatException, IOException {
		System.out.print("Enter mark for ("+subject.getName()+") :");
		int mark = Integer.parseInt(br.readLine());
		return mark;
	}


	private void displayAllSubjects() {
		for(int i=0; i< Subject.getCount(); i++) {
			Subject subject = this.subjectDao.getSubjectById(i+1);
			System.out.print(subject);
		}
	}


	public void findStudentByName() throws IOException {
		System.out.print("Enter Student name : ");
		String name = this.br.readLine();
		Student student = this.studentDao.getStudentByName(name);
		if(student==null) {
			System.out.println("Student not found error!!!!");
			findStudentByName();
		}
		
		this.exam.setStudent(student);
	}
}
