package com.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String country;
	
	private String State;
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}
}
