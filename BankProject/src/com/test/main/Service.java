package com.test.main;

import java.util.ArrayList;
import java.util.List;

import com.test.model.AccountDetails;

public class Service {
	AccountDetails accountdetails = new AccountDetails();

	public void deposit(double amount) {

		double bal = accountdetails.getBalance();
		System.out.println("Available balance in the account before deposit :" + bal);
		if (amount < 0) {
			System.out.println("deposit amount shouls not be in negative");
		} else {
			double balance = bal + amount;
			accountdetails.setBalance(balance);
			System.out.println("final amount is after deposit :" + accountdetails.getBalance());
			double accountBalance = accountdetails.getBalance();

		}

	}

	public void withdraw(double amount1) {
		double bal = accountdetails.getBalance();

		if (amount1 <= bal) {
			System.out.println("current balance  in  the account :" + bal);
			double balance = bal - amount1;
			accountdetails.setBalance(balance);
			System.out.println("final amount after withdraw :" + accountdetails.getBalance());
			double accountBalance = accountdetails.getBalance();

		} else {
			System.out.println("insufficient account balance , please check your balance");
		}

	}

	public void balanceEnquiry(long accountNumber) {
		accountdetails.setBalance(0.0);
		double bal = accountdetails.getBalance();
		System.out.println("Available balance in the account :" + bal);
	
	}

}
