package com.springboot.jpa3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientDbOperations {
	@Autowired
	PatientRepository repository;

	// adding single patient details
	public void addOnePatient(Patient p) {
		repository.save(p);// insert and update can be done with the same method "save
	}

	// deleting data by using primary key column

	public void deleteDetails(String name) {
		repository.deleteById(name);
	}

	// adding more patient details
	public void addMorePatientDetails() {
		List<Patient> patients = new ArrayList<>();

		Patient p2 = new Patient();
		p2.setName("two");
		p2.setAge(26);
		p2.setGender("female");
		p2.setContactNumber(2222222);
		p2.setEmailId("two@gmail.com");

		Patient p3 = new Patient();
		p3.setName("silar shaik");
		p3.setAge(27);
		p3.setGender("male");
		p2.setContactNumber(33333333);
		p3.setEmailId("three@gmail.com");

		Patient p4 = new Patient();
		p4.setName("four");
		p4.setAge(28);
		p4.setGender("female");
		p4.setContactNumber(4444444);
		p4.setEmailId("four@gmail.com");

		Patient p5 = new Patient();
		p5.setName("five");
		p5.setAge(29);
		p5.setGender("male");
		p5.setContactNumber(55555555);
		p5.setEmailId("five@gmail.com");

		Patient p6 = new Patient();
		p6.setName("six");
		p6.setAge(24);
		p6.setGender("male");
		p6.setContactNumber(66666666);
		p6.setEmailId("six@gmail.com");

		Patient p7 = new Patient();
		p7.setName("seven");
		p7.setAge(26);
		p7.setGender("female");
		p7.setContactNumber(77777777);
		p7.setEmailId("seven@gmail.com");

		patients.add(p2);
		patients.add(p3);
		patients.add(p4);
		patients.add(p5);
		patients.add(p6);
		patients.add(p7);

		repository.saveAll(patients);
	}

  	public void fetchPatientDetailsByName(String name) {
		repository.findById(name);
	}
  	
	public void getAllPatientDetails() {
		List<Patient> p= new ArrayList<>();
		repository.findAll();
	}
	
	public void deletePatientById(String name) {
		repository.deleteById(name);
	}
	
	public void fetchDataByName(String name) {
		repository.findById(name).get();
	}
	public void fetchAllPatients() {
		List<Patient> l= new ArrayList<>();
		repository.findAll();
	}
	public void deleteByContact(long contactNumber){
		repository.deleteByContactNumber(contactNumber);
	}

}
