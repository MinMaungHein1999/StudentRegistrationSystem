package com.example.dao;

import com.example.model.Exam;

public class ExameDaoImpl implements ExamDao {
	private Exam[] examDB;
	
	public ExameDaoImpl() {
		this.examDB = new Exam[Exam.getMaxExamCount()];
	}
	
	@Override
	public void addExam(Exam Exam) {
		// TODO Auto-generated method stub

	}

	@Override
	public Exam getExamById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam getExamByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam[] getAllExams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateExam(Exam Exam) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteExam(int id) {
		// TODO Auto-generated method stub

	}

}
