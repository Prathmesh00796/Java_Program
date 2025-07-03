package javapro;


public class DateTest {
    public static void main(String[] args) {
        Date myDate = new Date(6, 27, 2025);

        System.out.print("Initial date: ");
        myDate.displayDate();

        myDate.setMonth(12);
        myDate.setDay(31);
        myDate.setYear(2023);

        System.out.print("Updated date: ");
        myDate.displayDate();

        System.out.println("Month: " + myDate.getMonth());
        System.out.println("Day: " + myDate.getDay());
        System.out.println("Year: " + myDate.getYear());
        
    }
}
