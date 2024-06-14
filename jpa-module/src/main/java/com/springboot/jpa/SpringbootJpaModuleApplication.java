package com.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootJpaModuleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootJpaModuleApplication.class, args);
		
		//creating entity object
		FlipkartOrders flipkartorders= new FlipkartOrders();
		flipkartorders.setOrderId(11);
		flipkartorders.setProductName("redmi");
		flipkartorders.setTotalAmount(1500);
		
		//passing entity object to repository method
		OrderDbOperations odo=context.getBean(OrderDbOperations.class);
		odo.addOrderDetails(flipkartorders);
	}

}
