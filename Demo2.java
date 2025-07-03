package javapro;

public class Demo2 {

   
    public static double calculateTotalSalary(double basicSalary, double incentives) {
        double totalSalary = basicSalary + incentives;
        return totalSalary;
    }
    
    public static void main(String[] args) {
        double basic = 50000.0;
        double incentives = 10000.0;
        double total = calculateTotalSalary(basic, incentives);

        System.out.println("Total Salary: " +total);
    }
}
