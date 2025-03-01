package com.hashmap;



public class Address {
	int pin;
	String village;
	String post;
	String district;
	String state;
	String country;
	
	
	public Address() {
		
		this.pin = pin;
		this.village = village;
		this.post = post;
		this.district = district;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", village=" + village + ", post=" + post + ", district=" + district + ", state="
				+ state + ", country=" + country + "]";
	}
	
		
	

}
