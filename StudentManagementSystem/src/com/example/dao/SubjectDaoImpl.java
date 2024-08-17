package com.example.dao;

import com.example.model.Subject;

public class SubjectDaoImpl implements SubjectDao {
	
	private static Subject[] subjectsDB;
	
	public SubjectDaoImpl() {
		subjectsDB = new Subject[Subject.getMaxSubjectCount()];
	}

	@Override
	public void addSubject(Subject Subject) {
		// TODO Auto-generated method stub

	}

	@Override
	public Subject getSubjectById(int id) {
		for(int i=0; i< Subject.getCount(); i++) {
			if(id == subjectsDB[i].getId()) {
				return subjectsDB[i];
			}
		}
		return null;
	}

	@Override
	public Subject getSubjectByName(String name) {
		for(int i=0; i< Subject.getCount(); i++) {
			if(name.equalsIgnoreCase(subjectsDB[i].getName())) {
				return subjectsDB[i];
			}
		}
		return null;
	}

	@Override
	public Subject[] getAllSubjects() {
		return subjectsDB;
	}

	@Override
	public void updateSubject(Subject Subject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSubject(int id) {
		// TODO Auto-generated method stub

	}

}
