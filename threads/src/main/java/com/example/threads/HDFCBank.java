package com.example.threads;

public class HDFCBank {
	
	int accountBalanace;

	public HDFCBank(int accountBalanace) {
		this.accountBalanace = accountBalanace;
	}
	
	synchronized public void withdraw(int withdrawalAmount) {
		accountBalanace = this.accountBalanace - withdrawalAmount;
		
	}
	
	synchronized public void deposit(int amountToBeDeposited) {
		accountBalanace = this.accountBalanace + amountToBeDeposited;
		
	}
	
	synchronized public void balanceCheck() {
		System.out.println("Balance is "+ this.accountBalanace);
		
	}
	
	public void profileCheck() {
		System.out.println("Profile Checked ");
	}
	

}
