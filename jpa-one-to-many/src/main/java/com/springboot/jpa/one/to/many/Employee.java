package com.springboot.jpa.one.to.many;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name="emp_info")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long empId;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String mobile;
    
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	List<Address> address;
}
