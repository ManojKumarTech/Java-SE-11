package Others;

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
        ZoneId am = ZoneId.of("America/Los_Angeles");
        ZonedDateTime at = ZonedDateTime.now(am);
        System.out.println(at); 
          
    }
}
