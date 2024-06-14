package com.springboot.one.to.one;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="emp_info")
public class Employee {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empId;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@Column
	private String mobile;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_aid")
	Address address;
}
