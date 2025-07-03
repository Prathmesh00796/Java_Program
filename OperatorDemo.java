package javapro;
public class OperatorDemo {
    public static void main(String[] args) {
     
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b)); 

        int c = 5;
        System.out.println("\nAssignment Operators:");
        c += 3; // c = c + 3
        System.out.println("c += 3 -> " + c); // 8
        c -= 2; // c = c - 2
        System.out.println("c -= 2 -> " + c); // 6

        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));   
        System.out.println("a <= b: " + (a <= b)); 

        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); 
        System.out.println("x || y: " + (x || y)); 
        System.out.println("!x: " + (!x));         

        int p = 5;  
        int q = 3;  
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q = " + (p & q)); 
        System.out.println("p | q = " + (p | q)); 
        System.out.println("p ^ q = " + (p ^ q));  
        System.out.println("~p = " + (~p));         
        System.out.println("p << 1 = " + (p << 1));
        System.out.println("p >> 1 = " + (p >> 1)); 


    }
}
