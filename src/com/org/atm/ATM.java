package com.org.atm;

public class ATM {

	//Attributes
	private double money;
	private String type;
	private String[] transactionHistory;
	private int counter;

	
	//Constructors
	public ATM(String type) {
		this.money = 0;
		this.type = type;
		transactionHistory = new String[100];
		counter = 0;
	}

	//Methods
	public void deposit(double money) {
		
		
		this.money += money;
		System.out.println("Amount deposited " + money);
		
		transactionHistory[counter] = money + " has deposti in your account";
		counter++;
	}

	public void widthdraw(double money) {

		if (money > this.money) {
			System.out.println("Sorry, you don't have that amount of money to withdraw it");
			return;
		}

		this.money -= money;
		System.out.println("Amount withdrawed " + money);
		
		transactionHistory[counter] = money + " has withdrawed from your account";
		counter++;
		
	}

	public void showBalance() {

		System.out.println("Your balance is " + this.money);
	}


	
	
	//Set and Get methods
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getTransactionHistory() {
		for(int i=0 ; i<counter ; i++) {
			System.out.println((i+1) + ". " + transactionHistory[i]);
		}
		return transactionHistory;
	}


	
}
