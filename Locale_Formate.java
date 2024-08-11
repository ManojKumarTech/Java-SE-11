import java.math.BigDecimal;
import java.util.Locale;

public class Locale_Formate{
    public static void main(String args[]){
        Locale current = Locale.getDefault();
        //thaiLand calender:)
        Locale th = Locale.forLanguageTag("th-TH-u-ca-buddhist-nu-thai");
        System.out.println(th);

    }
}
