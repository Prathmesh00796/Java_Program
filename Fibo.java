package javapro;

public class Fibo{
	
    public static void main(String[] args) {
        int n = 20, a = 2, b = 3;
        
        for(int i = 0; i < n; i++) {
            System.out.println(+a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}                    
