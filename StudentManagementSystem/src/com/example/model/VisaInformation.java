package com.example.model;

public class VisaInformation {
	private String visaType;
	private String passport;
	
	public VisaInformation(String visaType, String passport) {
		this.passport = passport;
		this.visaType = visaType;		
	}

	@Override
	public String toString() {
	
		return "\n Passport : "+ this.passport + "\n Visa Type : " + this.passport;
	}
	
	
}
