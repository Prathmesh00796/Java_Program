import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int a = sc.nextInt();
        System.out.println("Enter width:");
        int b = sc.nextInt();
        int result = 2 * (a + b);
        System.out.println("The perimeter is:");
        System.out.println(result);
    }
}