package javapro;

import java.util.Scanner;
public class Program02 {
	
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter roll: ");

int roll=sc.nextInt();
System.out.print("Enter name: ");

String name = sc.next();
System.out.print("Enter marks: ");

double marks = sc.nextDouble();
System.out.println("Name:" + name);
System.out.println("Roll:" + roll);
System.out.println("Marks :"+marks);
}
}