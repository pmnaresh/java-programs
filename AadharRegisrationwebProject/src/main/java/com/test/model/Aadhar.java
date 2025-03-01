package com.test.model;

public class Aadhar {
	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private String maritalStatus;
	private String mobileNumber;
	private String villageName;
	private String district;
	private String state;
	private String country;
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getFirstName() {
		
		return firstName;
		
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
		
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
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
		return "Aadhar [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age
				+ ", maritalStatus=" + maritalStatus + ", mobileNumber=" + mobileNumber + ", villageName=" + villageName
				+ ", district=" + district + ", state=" + state + ", country=" + country + "]";
	}
	
	
	

}
