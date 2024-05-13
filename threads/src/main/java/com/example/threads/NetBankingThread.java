package com.example.threads;

public class NetBankingThread extends Thread {
private HDFCBank bankAccnt;
	
	public NetBankingThread(HDFCBank bankAccnt) {
		this.bankAccnt=bankAccnt;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccnt.profileCheck();
	}

}
