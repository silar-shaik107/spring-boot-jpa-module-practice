package com.springboot.custom.query.methods;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
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
