package javapro;

import java.util.Scanner;

public class Assignment2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();
        
        System.out.println("Given Num :" +num);
        System.out.println("Binary equivalent :" +Integer.toBinaryString(num));
        System.out.println("Octal equivalent :" +Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent :" +Integer.toHexString(num));
        scanner.close();
     }
 }
