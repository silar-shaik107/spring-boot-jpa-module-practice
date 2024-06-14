package com.springboot.generatedvalues.sequence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootGeneratedValuesApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootGeneratedValuesApplication.class, args);
		StudentDbOperations sdo=context.getBean(StudentDbOperations.class);
		
		sdo.addStudents();
		sdo.addOneMoreStudents();
		sdo.addAllStudents();
		
	}

}
