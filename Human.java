package javapro;

public class Human {
    int age;
    double height;
    double weight;

    Human(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    } 
    Human() {
    
        this(20, 5.10, 60);
    }

    void disp() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        Human h1 = new Human();  
        Human h2 = new Human(25, 5.75, 70.5);  

        System.out.println("Human 1:");
        h1.disp();

        System.out.println("\nHuman 2:");
        h2.disp();
    }
}
