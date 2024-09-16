package com.Interest;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int option;
		System.out.println("Enter the Average amount in your account: ");
		while(true) {
			System.out.println("Select an Option :\n"
					+ "1. Interest Calculator - SB\n"
					+ "2. Interest Calculator - FD\n"
					+"3. Interest Calculator - RD\n"
					+"4. Exit");
			option=sc.nextInt();
			try {
                switch (option) {
                    case 1:
                        System.out.println("Enter the Average amount in your account:");
                        double sbAmount = sc.nextDouble();
                        sc.nextLine(); 
                        System.out.println("Enter account type (Normal/NRI):");
                        String accountType = sc.nextLine();
                        SBAccount sbAccount = new SBAccount(sbAmount, accountType);
                        System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
                        break;

                    case 2:
                        System.out.println("Enter the FD amount:");
                        double fdAmount = sc.nextDouble();
                        System.out.println("Enter the number of days:");
                        int noOfDays = sc.nextInt();
                        System.out.println("Enter your age:");
                        int age = sc.nextInt();
                        FDAccount fdAccount = new FDAccount(fdAmount, noOfDays, age);
                        System.out.println("Interest gained is: Rs. " + fdAccount.calculateInterest());
                        break;

                    case 3:
                        System.out.println("Enter the RD monthly amount:");
                        double rdMonthlyAmount = sc.nextDouble();
                        System.out.println("Enter the number of months:");
                        int noOfMonths = sc.nextInt();
                        System.out.println("Enter your age:");
                        int rdAge = sc.nextInt();
                        RDAccount rdAccount = new RDAccount(noOfMonths,rdMonthlyAmount,  rdAge);
                        System.out.println("Interest gained is: Rs. " + rdAccount.calculateInterest());
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }

			
			
		}
	}

}
