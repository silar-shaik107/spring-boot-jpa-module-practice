package com.springboot.custom.query.methods;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public  class MainSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(MainSpringBootApplication.class, args);
		DbOperations ops=context.getBean(DbOperations.class);
		
		List<Patient> patient=ops.fetchDataByAge(26);
		System.out.println(patient);
		//ops.fetchDataByEmail("five@gmail.com");
		
	}

}
