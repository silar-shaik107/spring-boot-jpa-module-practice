package com.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDbOperations {
	@Autowired
	FlipkartOrdersRepository repository;
	public void addOrderDetails(FlipkartOrders order) {
	repository.save(order);	
	}
	
}
