package com.in28minutes.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_DETAILS")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="EMP_ID")
	private Integer empid;
	
	@Column(name="FIRST_NAME")
	private String e_FirstName;
	
	@Column(name="LAST_NAME")
	private String e_LastName;
	
	@Column(name="DOB")
	private Date dateOfBirth;

	public Employee() {
		super();
	}

	public Employee(String e_FirstName, String e_LastName, Date dateOfBirth) {
		super();
		this.e_FirstName = e_FirstName;
		this.e_LastName = e_LastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getE_FirstName() {
		return e_FirstName;
	}

	public void setE_FirstName(String e_FirstName) {
		this.e_FirstName = e_FirstName;
	}

	public String getE_LastName() {
		return e_LastName;
	}

	public void setE_LastName(String e_LastName) {
		this.e_LastName = e_LastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
