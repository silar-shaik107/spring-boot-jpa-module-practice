package com.springboot.jpa.many.to.one;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name="emp_info")
public class Employee {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empId;
	private String empName;
	private int age;
	private String mobile;
	
	
	@ManyToOne
	@JoinColumn()
	Department department;
	
	

}
