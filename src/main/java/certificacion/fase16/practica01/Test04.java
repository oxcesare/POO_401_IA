package certificacion.fase16.practica01;

import java.time.*;

public class Test04 {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER,31,10,0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }
}
