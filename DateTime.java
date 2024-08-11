import java.math.BigDecimal;
import java.time.*;

public class DateTime {
     public static void main(String args[]){
        System.out.println("Lets Learn java");
         LocalTime a = LocalTime.now();
         LocalDate b = LocalDate.now();
         LocalDateTime c = b.atTime(a);
        System.out.println(c);
        //for current time:)
        Instant now = Instant.now();
        System.out.println(now);
    }
}
