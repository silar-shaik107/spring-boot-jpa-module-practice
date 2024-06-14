package com.springboot.jpa3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class MainSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(MainSpringBootApplication.class, args);
		PatientDbOperations pdo=context.getBean(PatientDbOperations.class);
		
	/*	//add single patient that means creating object for entity class 
		Patient p=new Patient();
	    p.setName("silar_shaik");
	    p.setAge(27);
	    p.setGender("male");
	    p.setContactNumber(3333333);
	    p.setEmailId("three@gmail.com");
		pdo.addOnePatient(p); */
		
		//pdo.deleteDetails("one");
		//pdo.deleteByContact(0);
		
		pdo.addMorePatientDetails();
		//pdo.fetchPatientDetailsByName("three");
		
		//pdo.getAllPatientDetails();
		
		//pdo.deletePatientById("three");
		//pdo.fetchDataByName("four");
		//pdo.fetchAllPatients();
	}

}
