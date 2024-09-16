package com.Interest;

public class RDAccount extends Account{

	int noOfMonths;
	double monthlyAmount;
	int ageOfACHolder;
	
	
	public RDAccount(int noOfMonths, double monthlyAmount, int ageOfACHolder) {
		this.noOfMonths = noOfMonths;
		this.monthlyAmount = monthlyAmount;
		this.ageOfACHolder = ageOfACHolder;
	}

	

	@Override
	 double calculateInterest() throws InvalidException {
        if (monthlyAmount < 0 || noOfMonths < 0 || ageOfACHolder < 0) {
            throw new InvalidException("Invalid input. Please enter correct values.");
        }

        if (noOfMonths == 6) {
            interestRate = ageOfACHolder >= 60 ? 8.00 : 7.50;
        } else if (noOfMonths == 9) {
            interestRate = ageOfACHolder >= 60 ? 8.25 : 7.75;
        } else if (noOfMonths == 12) {
            interestRate = ageOfACHolder >= 60 ? 8.50 : 8.00;
        } else if (noOfMonths == 15) {
            interestRate = ageOfACHolder >= 60 ? 8.75 : 8.25;
        } else if (noOfMonths == 18) {
            interestRate = ageOfACHolder >= 60 ? 9.00 : 8.50;
        } else if (noOfMonths == 21) {
            interestRate = ageOfACHolder >= 60 ? 9.25 : 8.75;
        }

        return monthlyAmount * noOfMonths * interestRate / 100;
    }
}
