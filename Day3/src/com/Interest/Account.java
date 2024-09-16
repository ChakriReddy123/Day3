package com.Interest;

 abstract class Account {
	double interestRate;
	double amount;
	abstract double calculateInterest() throws InvalidException;
	
	
}
