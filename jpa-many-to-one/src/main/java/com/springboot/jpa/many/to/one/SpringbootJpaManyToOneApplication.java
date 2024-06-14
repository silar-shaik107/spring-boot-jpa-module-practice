package com.springboot.jpa.many.to.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootJpaManyToOneApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootJpaManyToOneApplication.class, args);
	
	
			DbOperations dbo=context.getBean(DbOperations.class);
			dbo.addEmpolyees();
	}

}
