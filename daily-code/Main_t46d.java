import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        double r = input.nextDouble();
        if (r <= 0) {
            System.out.println("Radius must be positive");
        } else {
            double area = 3.14 * r * r;
            double circ = 2 * 3.14 * r;
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circ);
        }
    }
}