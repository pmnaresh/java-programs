package com.test;

public class Aadhar {
	private String name;
	private String gender;
	private Integer age;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Adhar [name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	

}
