import java.math.BigDecimal;
import java.time.*;

public class Add {
     public static void main(String args[]){
        System.out.println("Lets Learn java");
         LocalDate thisTime = LocalDate.from(LocalDateTime.from(LocalTime.of(12,12)));
         LocalDate nextTime = LocalDate.from(LocalDateTime.from(LocalTime.of(21,12)));
         Period a = Period.between(thisTime,nextTime);
         LocalDate someDay = LocalDate.now();
         LocalDateTime toDay = someDay.atTime(LocalTime.from(thisTime));
         LocalTime t = LocalTime.of(11,11);
        System.out.println(thisTime);
    }
}
