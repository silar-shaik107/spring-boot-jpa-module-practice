package com.springboot.jpa.many.to.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class DbOperations {
	
	@Autowired
	EmployeeRepository emprepository;
	
	@Autowired
	DepartmentRepository deptrepository;
	
	
	public void addEmpolyees() {
		
		//Department entity object
		Department dept=new Department();
		//dept.setId(101);
		dept.setName("HR");
		
		
		//Employee entity object
		Employee emp1=new Employee();
		//emp1.setEmpId(101);
		emp1.setEmpName("kanta hemanth");
		emp1.setAge(22);
		emp1.setMobile("8783497289");
		emp1.setDepartment(dept);
		
		//another Employee entity object
		Employee emp2=new Employee();
		//emp2.setEmpId(102);
		emp2.setEmpName("Gundra Anil Kumar ");
		emp2.setAge(22);
		emp2.setMobile("6662378728");
		emp2.setDepartment(dept);
		
		emprepository.save(emp1);
		emprepository.save(emp2);
		deptrepository.save(dept);
		
	}
	

}
