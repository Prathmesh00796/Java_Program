import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers:");
        int n = sc.nextInt();
        double[] nums = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number:");
            nums[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        double avg = sum / n;
        System.out.println("The average is:");
        System.out.println(avg);
    }
}