package java12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatChanges {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCompactNumberInstance();
        System.out.println(format.format(1000));
        format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(format.format(1000));
        format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(format.format(1000));
    }
}
