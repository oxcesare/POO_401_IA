package certificacion.fase16.practica07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test01 {

    public static void main(String[] args) {
        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");
        String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(greatDayStr);

    }
}
