package com.example.threads;

public class ATMThread extends Thread {
	
	private HDFCBank bankAccnt;
	
	ATMThread(HDFCBank bankAccnt) {
		this.bankAccnt=bankAccnt;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccnt.withdraw(4000);
	}

} 
