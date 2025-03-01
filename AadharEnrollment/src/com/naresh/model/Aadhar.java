package com.naresh.model;

public class Aadhar {
	
	private String fName;
	private String lName;
	private String gender;
	private Integer age;
	private Long contactNumber;
	private Address address;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Aadhar [fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", age=" + age
				+ ", contactNumber=" + contactNumber + ", address=" + address + "]";
	}
	
	
	

}
