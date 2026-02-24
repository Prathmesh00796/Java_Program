import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 25, 30, 45, 50};
        System.out.println("Enter number to search:");
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index " + index);
        }
    }
}