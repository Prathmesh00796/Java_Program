import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principle:");
        double p = s.nextDouble();
        System.out.println("Enter rate:");
        double r = s.nextDouble();
        System.out.println("Enter time:");
        double t = s.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("The Simple Interest is:");
        System.out.println(si);
    }
}