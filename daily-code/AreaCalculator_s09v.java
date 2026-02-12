import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = input.nextDouble();
        if (r < 0) {
            System.out.println("Radius cannot be negative");
        } else {
            double pi = 3.14159;
            double area = pi * r * r;
            System.out.println("The area is:");
            System.out.println(area);
        }
    }
}