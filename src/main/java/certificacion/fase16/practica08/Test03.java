package certificacion.fase16.practica08;

import java.time.*;

public class Test03 {
    public static void main(String[] args) {

        // 1. Capturar el instante local exacto del sistema (Fecha + Hora actual)
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println(ahora);

        // 2. Crear una fecha y hora fija de forma manual
        LocalDateTime lanzamiento = LocalDateTime.of(2026, Month.OCTOBER, 24, 23, 30);
        System.out.println(lanzamiento);

        // 3. ¡La Fusión! Combinar un LocalDate y un LocalTime independientes
        LocalDate fecha = LocalDate.of(2026, 6, 28);
        LocalTime hora  = LocalTime.of(17, 30);

        LocalDateTime fechaHoraCombinada = LocalDateTime.of(fecha, hora);
        // O usando el método fluido del objeto:
        LocalDateTime combinada2 = fecha.atTime(hora);
        System.out.println(fechaHoraCombinada);
        System.out.println(combinada2);
    }
}
