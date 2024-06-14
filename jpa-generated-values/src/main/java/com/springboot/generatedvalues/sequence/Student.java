package com.springboot.generatedvalues.sequence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Student_Details")
@Setter
@Getter
public class Student {
	  @Id
	  @Column(name="stu_id")
	  
	  /* by default it is AUTO
	    @GeneratedValue(strategy=GenerationType.AUTO)
	  */
	  /*IDENTITY generator
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	  */
	  
	  //sequence generator
	  @SequenceGenerator(name="stuid",sequenceName="stuid",initialValue=600,allocationSize=1)
	  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="stuid")
	  
	  
	  /*TABLE generator
	  @TableGenerator(name="stuid", table="stuid",pkColumnName="STU_ID",pkColumnValue="STU_ID_value",initialValue=200,allocationSize=1)
	  @GeneratedValue(strategy=GenerationType.TABLE,generator="stuid")
	  error in table example
	  */
	  
	/*  @GeneratedValue(strategy=GenerationType.UUID)
	  error in this UUID example
	 */
	  
	  private int stuId;
	  
	  @Column(name="stu_name")
	  private String stuName;
	 
	  @Column(name="phone_number")
	  private long PhoneNumber;
	 
	  @Column(name="email")
	  private String email; 

}

