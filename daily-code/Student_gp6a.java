import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
        if (marks >= 50) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
    }
}