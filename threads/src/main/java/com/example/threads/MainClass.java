package com.example.threads;

public class MainClass {
	
	public static void main(String[] args) {
		
		HDFCBank myAccnt = new HDFCBank(7000);
		
		ATMThread atm = new ATMThread(myAccnt);
		atm.setName("ATM Thread");
		
		GooglePayThread googlePay = new GooglePayThread(myAccnt);
		googlePay.setName("GooglePay Thread");
		
		PhonePayThread phonePay = new PhonePayThread(myAccnt);
		phonePay.setName("PhonePay Thread");
		
		NetBankingThread netBanking = new NetBankingThread(myAccnt);
		netBanking.setName("NetBanking Thread");
		
		atm.start();
		googlePay.start();
		phonePay.start();
		netBanking.start();
	}

}
