package javapro;

public class largenum {
    public static void main(String[] args) {
        int a= 10;
        int b= 40;
        int c = 21;
        int largest = a;

        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Largest number : " +largest);
    }
}
