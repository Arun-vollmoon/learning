import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class date {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDate birth = LocalDate.of(2006,05,22);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        System.out.println(today.plusDays(15));
//        System.out.println(today.minusDays(2));
        Period age=Period.between(birth,today);
        System.out.println(age.getYears());
        System.out.println(age.getMonths());
        System.out.println(age.getDays());
        System.out.println(time);
    }
}