package com.test;

public class Address {
	private String doornumber;
	private String street;
	private String state;
	private String country;
	public String getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(String doornumber) {
		this.doornumber = doornumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [doornumber=" + doornumber + ", street=" + street + ", state=" + state + ", country=" + country
				+ "]";
	}
	

}
