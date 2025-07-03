package javapro;

import java.util.Scanner;

public class assignment5 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String Customers;
   
	        System.out.print("Enter Account Number :");
	        int accno=sc.nextInt();
	        	
	        System.out.print("Account Balace :");
            int accbal=sc.nextInt();
	        
            int charges=1000;
            if(accbal>10000)
            {
            	System.out.print("Your Credit Limit :");
            	int limit=10000;
            }
            else
            {
            	System.out.print("Not elligible..");
            }
            
	        
	        
	        
}
}
