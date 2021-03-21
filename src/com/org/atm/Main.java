package com.org.atm;

import java.util.Scanner;
public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ATM atm = new ATM("checking");

		System.out.println("This is ATM\n---");
		System.out.println("Your currently have " + atm.getMoney() + " in your account");
		
		int processNumber = 0;
		
		while(processNumber != 5) {
			processes(); // show processes in console
			processNumber = input.nextInt();
			
			//check that number entered match the processes
			while(processNumber <= 0 || processNumber > 5) {
				System.out.println("No such a process like that ! ");
				processes(); // show processes in console
				processNumber = input.nextInt();				
			}
			
			processNumber(processNumber, atm);
		}
		
	}
	
	public static void processes() {
		System.out.println("\nEnter Process Number"
				+ "\n1- Deposite"
				+ "\n2- Widthdraw"
				+ "\n3- Current Balance"
				+ "\n4- Transaction History"
				+ "\n5- Terminate");
	}
	
	public static void processNumber(int number, ATM atm) {
						
		if(number == 5)
			return;
		
		double money = 0;

		switch(number) {
		case 1:
			System.out.println("---DEPOSITE---");
			System.out.print("Enter amount: ");
			money = input.nextDouble();
			atm.deposit(money);
			break;
		case 2:
			System.out.println("---WIDTHDRAW---");
			System.out.print("Enter amount: ");
			money = input.nextDouble();
			atm.widthdraw(money);
			break;
		case 3:
			System.out.println("---CURRENT BALANCE---");
			atm.showBalance();
			break;
		case 4:
			System.out.println("---TRANSACTION HISTORY---");
			atm.getTransactionHistory();
			break;	
		}
		
	}

}
