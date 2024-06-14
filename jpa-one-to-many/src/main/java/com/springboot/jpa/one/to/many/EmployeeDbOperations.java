package com.springboot.jpa.one.to.many;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDbOperations {
	
	@Autowired
	EmployeeRepository repository;
	
	public void addNewEmployee() {
		
		List<Address> empaddress=new ArrayList<>();
		Address home=new Address();
		home.setAddressId(101);  
		home.setCity("HYD");
		home.setState("TG");
		home.setPincode(522019);
		empaddress.add(home);
		
		Address office=new Address();
		office.setAddressId(102); 
		office.setCity("Vizag");
		office.setState("AP");
		office.setPincode(459900);
		empaddress.add(office);
		
		
		Employee employee=new Employee();
		employee.setEmpId(101);  
		employee.setName("Bobba Sandeep");
		employee.setAge(23);
		employee.setMobile("5374728746");
		employee.setAddress(empaddress);
		
		employee=repository.save(employee);
		
	}

}
