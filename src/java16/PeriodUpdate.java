package java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PeriodUpdate {
    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("17:30:08.123456");

        //B will tell the period is it in afternoon or morning
        DateTimeFormatter format = DateTimeFormatter.ofPattern("h B");


        System.out.println(time.format(format));

    }
}
