package com.springboot.jpa2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class EmployeeDbOperations {
	@Autowired
	EmployeeRepository repository;
	
	public void ListOfEmployeeDetails() {
		
		List<Employee> employee=new ArrayList<>();
		
		Employee emp1=new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("shaik silar");
		emp1.setEmpSalary(5000);
		
		Employee emp2=new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("bathula sarath");
		emp2.setEmpSalary(6000);
		
		Employee emp3=new Employee();
		emp3.setEmpId(103);
		emp3.setEmpName("popppusani narsi");
		emp3.setEmpSalary(7000);

		Employee emp4=new Employee();
		emp4.setEmpId(104);
		emp4.setEmpName("posani narayana");
		emp4.setEmpSalary(8000);
		
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		
		repository.saveAll(employee);
	}
	/*public void deleteById( int empId) {
		repository.deleteById(empId);
	} */
	
	/*public void findById(int empId) {
		repository.findById(empId);
	}*/
	
  public void loadAllEmployees() {
	  List<Employee> allemployees= new ArrayList<>();
	  repository.findAll();
	  for(Employee emp:allemployees) {
		  System.out.println(emp.getEmpId());
		  System.out.println(emp.getEmpName());
		  System.out.println(emp.getEmpSalary());;
	  }
  }
}
