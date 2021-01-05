package com.org.atm;

public class Main {

	public static void main(String[] args) {

		ATM atm = new ATM("checking");
		
		atm.deposit(1000);
		atm.deposit(500);
		atm.showBalance();
		
		atm.widthdraw(1500);
		atm.showBalance();

		atm.getTransactionHistory();
	}

}
