package com.springboot.one.to.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDBOperations {

	@Autowired
	EmployeeRepository repository;

	public void addNewEmployee() {

		// create address entity object
		Address address = new Address();
		address.setAddressId(101);// Auto-increment
		address.setCity("CHN");
		address.setState("AP");
		address.setPincode(51123);

		// create employee entity object
		Employee employee = new Employee();
		 employee.setEmpId(102);  // Auto-Increment
		employee.setName("sarath battula");
		employee.setAge(23);
		employee.setMobile("7466248875");

		// setting address entity object inside employee
		employee.setAddress(address);
		repository.save(employee);

	}

	public void deleteByEmployeeId(long empId) {
		repository.deleteById(empId);
	}
}
