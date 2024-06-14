package com.springboot.jpa3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table
public class Patient {
	      @Id
	      @Column
          private String name;
	      @Column
          private int age;
	      @Column
          private String gender;
	      @Column
          private long contactNumber;
	      @Column
          private String emailId;
		
	      
	      
}
