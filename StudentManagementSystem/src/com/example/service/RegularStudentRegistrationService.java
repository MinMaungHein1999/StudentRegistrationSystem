package com.example.service;

import java.io.IOException;
import com.example.model.RegularStudent;
import com.example.model.Student;

public class RegularStudentRegistrationService extends RegistrationService{

	public RegularStudentRegistrationService() throws IOException {
		super();
	}

	@Override
	public void getTypeInfo() throws IOException {
		System.out.print("Enter nrc : ");
		String nrc = this.br.readLine(); 
		Student student =new RegularStudent(this.getStudent(), nrc);
		this.setStudent(student);
	}
}
