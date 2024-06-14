package com.springboot.one.to.one;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="emp_address")
public class Address {
	  @Id
	  @Column
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int addressId;
	  
	  @Column
      private String city;
	  
	  @Column
      private int pincode;
	 
	  @Column
      private String state;
}
