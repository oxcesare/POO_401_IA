package unidad2.listas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjemploMapas {

    public static void main(String[] args) {

        List<String> cadenas = Arrays.asList("lectura1", "Lectura2",
                "Lectura2", "Lectura3", "Lectura4", "Lectura3",
                "Lectura2", "Lectura5", "Lectura7");

        Map<String, Integer> frecuencia = new HashMap<>();

        for (String c : cadenas) {
            frecuencia.merge(c, 1, Integer::sum);

        }
        System.out.println(frecuencia.toString());


    }
}
