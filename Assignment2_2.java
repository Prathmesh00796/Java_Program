package javapro;

import java.util.Scanner;

public class Assignment2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Not Valid");
            sc.close();
            return;
        }
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Not Valid");
            sc.close();
            return;
        }
        double b = sc.nextDouble();

        double avg = (a + b) / 2;
        System.out.println("Avg: " + avg);
        
        sc.close();
    }
}
