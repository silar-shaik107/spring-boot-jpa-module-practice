package com.springboot.jpa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainSpringBootClass {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(MainSpringBootClass.class, args);
		EmployeeDbOperations edo=context.getBean(EmployeeDbOperations.class);
		
		//saveAll()
		edo.ListOfEmployeeDetails();
		
		//deleting existing employee by id
		//edo.deleteById(101);
		
		// fetching or reading data from existing
	   // edo.findById(102);
		edo.loadAllEmployees();
	}

}
