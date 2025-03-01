package com.test.model;

public class AccountDetails {

	private long accountNumber;
	private String ifscCode;
	private String accountType;
	private int pin;
	private double balance;

	CustomerDetails customerdetails = new CustomerDetails();

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public CustomerDetails getCustomerdetails() {
		return customerdetails;
	}

	public void setCustomerdetails(CustomerDetails customerdetails) {
		this.customerdetails = customerdetails;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", accountType="
				+ accountType + ", pin=" + pin + ", balance=" + balance + ", customerdetails=" + customerdetails + "]";
	}

}
