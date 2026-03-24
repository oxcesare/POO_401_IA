package unidad2.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioListas {

    private static final List<String> STOP_WORDS =
            Arrays.asList("el", "la", "un");

    private static final List<String> VALID_WORDS =
            new ArrayList<>(Arrays.asList("Sol", "luna", "cielo", "el"));


    private void validarPalabrasLetras() {
        VALID_WORDS.removeAll(STOP_WORDS);
    }

    private void convertirPalabras() {
        //Convertir cada palabra en mayuscula
        VALID_WORDS.replaceAll(String::toUpperCase);
    }

    public static void main(String[] args) {
        EjercicioListas ejercicio = new EjercicioListas();
        ejercicio.validarPalabrasLetras();
        ejercicio.convertirPalabras();
        System.out.println("Solo validas en mayuscula");
        VALID_WORDS.forEach(System.out::println);
    }
}
