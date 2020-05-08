package com.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




public class Employee {
	
	@NotNull(message = "is Required")
	@Size(min = 2, message = "enter minimum 1 char...." )
	private String empName;
	private int empAge;
	
	public Employee() {
		System.out.println();
	}
	
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
