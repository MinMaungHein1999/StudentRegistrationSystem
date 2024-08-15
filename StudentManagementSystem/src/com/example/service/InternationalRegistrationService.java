package com.example.service;

import java.io.IOException;

import com.example.model.InternationalStudent;
import com.example.model.VisaInformation;
import com.example.model.Student;

public class InternationalRegistrationService extends RegistrationService {
	
	public InternationalRegistrationService() throws IOException {
		super();
	}

	@Override
	public void getTypeInfo() throws IOException {
		System.out.print("Enter VisaType : ");
		String type = this.br.readLine(); 
		System.out.print("Enter Passport : ");
		String passport = this.br.readLine();
		VisaInformation visaInfo = new VisaInformation(type, passport);
		Student student =new InternationalStudent(this.getStudent(), visaInfo);
		this.setStudent(student);		
	}

}
