import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a') {
                count = count + 1;
            } else if (c == 'e') {
                count = count + 1;
            } else if (c == 'i') {
                count = count + 1;
            } else if (c == 'o') {
                count = count + 1;
            } else if (c == 'u') {
                count = count + 1;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}