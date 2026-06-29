package certificacion.fase16.practica08;

import java.time.*;

public class Test02 {

    public static void main(String[] args) {

        // 1. Obtener la fecha actual del sistema
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);


        // 2. Crear una fecha específica (Enero 31, 2026)
        LocalDate fechaEspecifica = LocalDate.of(2026, Month.JANUARY, 31);
        System.out.println(fechaEspecifica);

        // 3. Parsear una cadena de texto en formato ISO
        LocalDate fechaParseada = LocalDate.parse("2026-12-25");
        System.out.println(fechaParseada);
    }
}
