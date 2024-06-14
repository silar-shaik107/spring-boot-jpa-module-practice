package com.springboot.jpa.one.to.many;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootJpaOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootJpaOneToManyApplication.class, args);
		
		EmployeeDbOperations edo=context.getBean(EmployeeDbOperations.class);
		edo.addNewEmployee();
	}

}
