import java.math.BigDecimal;
import java.time.*;

public class Add {
     public static void main(String args[]){
        System.out.println("Lets Learn java");
         LocalTime a = LocalTime.now();
         LocalDate b = LocalDate.now();
         LocalDateTime c = b.atTime(a);
        System.out.println(c);
    }
}
