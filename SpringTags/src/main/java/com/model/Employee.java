package com.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	
	private int id;
	private String name;
	private String statename;
	private Address address;
	
	public Employee() {
		System.out.println("");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
