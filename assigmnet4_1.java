package javapro;

import java.util.Scanner;

public class assigmnet4_1 {
	 public static void main (String [] args) {
		 
		 Scanner input=new Scanner(System.in);
		 
		 int totalmiles;
		 int gasoline;
		 int avggaso;
		 int parkfee;
		 int tollfee;
		 int drivecost;
		 
		 System.out.print("total Miles Per Day :");
		 totalmiles=input.nextInt();
		 
		 System.out.print("Cost per gallon of gasoline :");
		 gasoline=input.nextInt();
		 
		 System.out.print("Average miles per gallon :");
		 avggaso=input.nextInt();
		 
		 System.out.print("Parking fees per day :");
		 parkfee=input.nextInt();
		 
		 System.out.print("Tolls per day :");
		 tollfee=input.nextInt();
		 
		 drivecost=(totalmiles/avggaso)*gasoline+parkfee+tollfee;
		 
		 
		 System.out.print("Your Daily Drive cost per Day :"+drivecost);	 
}
}
