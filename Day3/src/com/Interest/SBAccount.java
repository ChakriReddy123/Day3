package com.Interest;

public class SBAccount extends Account{
	String accountType;
	
	public SBAccount(double amount,String accountType) {
		this.accountType = accountType;
		this.amount = amount;
	}
	@Override
	double calculateInterest() throws InvalidException {
        if (amount < 0) {
            throw new InvalidException("Invalid amount. Please enter valid amount.");
        }

        if (accountType.equals("Normal")) {
            interestRate = 4.0;
        } else if (accountType.equals("NRI")) {
            interestRate = 6.0;
        }
        return amount * interestRate / 100;
    }
}
