package com.example.threads;

public class PhonePayThread extends Thread {
private HDFCBank bankAccnt;
	
	public PhonePayThread(HDFCBank bankAccnt) {
		this.bankAccnt=bankAccnt;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccnt.balanceCheck();
	}
	
}
