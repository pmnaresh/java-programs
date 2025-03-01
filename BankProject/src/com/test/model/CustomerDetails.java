package com.test.model;

public class CustomerDetails {
	private String name;
	private String fatherName;
	private long aadharNumber;
	private long phoneNumber;
	private String panNumber;
	AddressDetails addressdetails = new AddressDetails();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public AddressDetails getAddressdetails() {
		return addressdetails;
	}
	public void setAddressdetails(AddressDetails addressdetails) {
		this.addressdetails = addressdetails;
	}
	@Override
	public String toString() {
		return "CustomerDetails [name=" + name + ", fatherName=" + fatherName + ", aadharNumber=" + aadharNumber
				+ ", phoneNumber=" + phoneNumber + ", panNumber=" + panNumber + ", addressdetails=" + addressdetails
				+ "]";
	}

}
