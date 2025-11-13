import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Current date and time
        LocalDate date= LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime= LocalDateTime.now();

        //Specific date and time
        LocalDate date1= LocalDate.of(2003,12,20);
        LocalTime time1= LocalTime.of(00,30,50);

        //Output
        System.out.println("Date is "+date);
        System.out.println("Time is "+time);
        System.out.println("dateTime "+ dateTime);

        System.out.println();
        System.out.println("I was born on "+date1+" at "+ time1);
    }
}