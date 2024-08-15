package com.example.model;

public class InternationalStudent extends Student{
	private VisaInformation visaInformantion;
	
	public InternationalStudent(Student student, VisaInformation visaInfo) {
		super(student, false);
		this.visaInformantion = visaInfo;
	}
	
	@Override
	public String toString() {
		return super.toString() + visaInformantion.toString();
	}
	
}
