package javapro;

import java.util.Scanner;

public class CreditLimitChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Customers : ");
        int numberOfCustomers = input.nextInt();

        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.println("\nCustomer #" + i);

            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.println("New balance for account " + accountNumber + ": " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
       
        else
        {
        	System.out.print("Limit not Exceedede");
        }
        }

        input.close();
       
    }
}
