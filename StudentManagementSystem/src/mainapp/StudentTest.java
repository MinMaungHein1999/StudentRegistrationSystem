package mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.service.InternationalRegistrationService;
import com.example.service.RegistrationService;
import com.example.service.RegularStudentRegistrationService;

public class StudentTest {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static RegistrationService service;
	
	public static void runStudentRegister() throws IOException {
		System.out.print("Is Regular Student ? yes/no : ");
		String flag = br.readLine();
		
		if(flag.equalsIgnoreCase("yes")) {
			service= new RegularStudentRegistrationService();
		}else {
			service= new InternationalRegistrationService();
		}
		System.out.print("Do you want to Continue? yes/no : ");
		flag = br.readLine();
		
		if(flag.equalsIgnoreCase("yes")) {
			runStudentRegister();
		}
	
	}

	public static void main(String[] args) throws IOException {
		runStudentRegister();
		service.displayStudents();
	}

}
