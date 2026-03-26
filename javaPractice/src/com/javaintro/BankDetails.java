package com.javaintro;

public class BankDetails {
	int accountNumber;
	String accountHolderName;
	int balance;
	static String branch="Hyderabad";
	static String bankName="SBI";

	public static void main(String[] args) {
		BankDetails user1 = new BankDetails();
		user1.accountHolderName="Rajendra";
		user1.accountNumber=23829224;
		user1.balance=2000;
		
		BankDetails user2 = new BankDetails();
		user2.accountHolderName="Gangadhar";
		user2.accountNumber=21349224;
		user2.balance=5000;
		
		BankDetails user3 = new BankDetails();
		user3.accountHolderName="Tanish";
		user3.accountNumber=23834324;
		user3.balance=3000;
		
		System.out.println("User1 Details:");
		System.out.println(user1.accountHolderName);
		System.out.println(user1.accountNumber);
		System.out.println(user1.balance);
		System.out.println(branch);
		System.out.println(bankName);
		System.out.println(" ");
		
		System.out.println("User2 Details:");
		System.out.println(user2.accountHolderName);
		System.out.println(user2.accountNumber);
		System.out.println(user2.balance);
		System.out.println(branch);
		System.out.println(bankName);
		System.out.println(" ");
		
		System.out.println("User3 Details:");
		System.out.println(user3.accountHolderName);
		System.out.println(user3.accountNumber);
		System.out.println(user3.balance);
		System.out.println(branch);
		System.out.println(bankName);
	}
}
