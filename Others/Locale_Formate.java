package Others;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Locale_Formate {
    public static void main(String args[]) {
        Locale uk = new Locale("en", "GB");
        // Thai calendar locale
        Locale th = Locale.forLanguageTag("th-TH-u-ca-buddhist-nu-thai");
        System.out.println(th);

        BigDecimal prize = BigDecimal.valueOf(2.99);
        double tax = 0.2;
        int quantity = 12345;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(uk);
        String fPrize = currencyFormat.format(prize);
        System.out.println(fPrize);
    }
}
