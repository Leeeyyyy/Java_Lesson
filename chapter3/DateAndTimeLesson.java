package chapter3;
import java.time.*;

public class DateAndTimeLesson {
     
    public static void main(String[] args) {
        
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        LocalDate.of(2003, 9, 19);
        LocalDate date1 = LocalDate.of(2003, 9, 19);
        LocalDate date2 = LocalDate.of(2015, Month.JANUARY, 1);
        LocalTime time1 = LocalTime.of(12, 50, 23, 500000000);
        LocalDateTime ldt1 = LocalDateTime.of(2005, 6, 7, 6, 15);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(time1);
        System.out.println(ldt1);
        LocalDate myBirthday = LocalDate.of(2001, 1, 15);
        //date plus or minus - Years, Months, Weeks, Days
        System.out.println(date2);
        System.out.println(date2.plusDays(22).minusWeeks(1));
        System.out.println(myBirthday);
        


    }
}
