package com.springboot.generatedvalues.sequence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDbOperations {
	@Autowired
	StudentRepository repository;

	public void addStudents() {
		Student s1 = new Student();
		//s1.setStuId(1);
		s1.setStuName("shaik silar");
		s1.setPhoneNumber(9866248875L);
		s1.setEmail("shiaksilar@gmail.com");
		repository.save(s1);
	}

	public void addOneMoreStudents() {
		Student s2 = new Student();
		// s2.setStuId(2);
		s2.setStuName("posani narayana");
		s2.setPhoneNumber(8652487515L);
		s2.setEmail("narayna@gmail.com");
		repository.save(s2);
	}

	public void addAllStudents() {
		List<Student> stu = new ArrayList<>();
		Student s3 = new Student();
		// s2.setStuId(3);
		s3.setStuName("poppusani narsi");
		s3.setPhoneNumber(6052487515L);
		s3.setEmail("naaaarsi@gmail.com");
		
		
		Student s4 = new Student();
		// s4.setStuId(4);
		s4.setStuName("bathula sarath");
		s4.setPhoneNumber(7852487515L);
		s4.setEmail("saaraath@gmail.com");
		
		
		Student s5 = new Student();
		// s5.setStuId(5);
		s5.setStuName("Bobba Sandeep");
		s5.setPhoneNumber(7252487515L);
		s5.setEmail("sandeep@gmail.com");
	     
		
		Student s6 = new Student();
		// s6.setStuId(6);
		s6.setStuName("kanta hemanth");
		s6.setPhoneNumber(5652487515L);
		s6.setEmail("hemanth@gmail.com");
		
		
		//adding list of students
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		stu.add(s6);
		repository.saveAll(stu);

	}
	

}
