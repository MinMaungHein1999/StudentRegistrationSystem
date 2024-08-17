package com.example.dao;
import com.example.model.Subject;

public interface SubjectDao {
	void addSubject(Subject Subject);
	Subject getSubjectById(int id);
	Subject getSubjectByName(String name);
	Subject[] getAllSubjects();
	void updateSubject(Subject Subject);
	void deleteSubject(int id);
}
