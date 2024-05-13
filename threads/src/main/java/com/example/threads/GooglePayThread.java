package com.example.threads;

public class GooglePayThread extends Thread {
	private HDFCBank bankAccnt;
	
	public GooglePayThread(HDFCBank bankAccnt) {
		this.bankAccnt=bankAccnt;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccnt.deposit(5000);
	}

}
