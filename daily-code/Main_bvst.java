import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero");
        } else {
            double result = num1 / num2;
            System.out.println("The result is: " + result);
        }
    }
}