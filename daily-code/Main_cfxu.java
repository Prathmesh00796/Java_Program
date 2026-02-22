import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 25, 30, 45, 50};
        System.out.println("Enter a number to find:");
        int target = sc.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
            }
        }
        if (foundIndex == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index " + foundIndex);
        }
    }
}