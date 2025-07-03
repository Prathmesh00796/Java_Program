package javapro;

import java.util.Scanner;

public class demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");  
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        
        double b = sc.nextDouble();
        
        if (!sc.hasNextDouble()) {
            System.out.println("Not Valid");
        }
        
        else
        {

        double avg = (a + b) / 2;
        System.out.println("Avg: " + avg);
        
        
    }
    }
}
