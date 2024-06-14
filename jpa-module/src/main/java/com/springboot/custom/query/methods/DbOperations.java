package com.springboot.custom.query.methods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DbOperations {
	@Autowired
	PatientRepository repository;
	
	
	public List<Patient> fetchDataByAge(int age) {
		return repository.findByAge(age);
	}
	
	public void fetchDataByEmail(String emailId) {
		repository.findByEmailId(emailId);
	}

}
