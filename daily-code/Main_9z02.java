import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
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