package com.example.model;

public class RegularStudent extends Student{
	private String nrc;
	
	public RegularStudent(Student student, String nrc) {
		super(student, true);
		this.nrc = nrc;
	}

	@Override
	public String toString() {
		return super.toString()+"\n nrc : " + nrc;
	}
	
	
}
