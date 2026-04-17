package unidad3.ejercicios.set;

import java.sql.Array;
import java.util.*;

public class GeneradorVocabulario {

    public static void main(String[] args) {
        String texto = "el modelo de ia es un modelo bueno porque el modelo aprende";
        String[] tokens = texto.split(" ");

        //Instanciamos un Set con la implementacion HashSet
        Set<String> vocabulario = new HashSet<>();

        // Iteramos el arreglo de tokens y agregamos al set
        for (String t : tokens) {
            vocabulario.add(t);
        }
        System.out.println("Vocabulario: " + vocabulario);
        System.out.println("Palabras Procesadas" + " " + tokens.length);
        System.out.println("Numero de palabras" + " " + vocabulario.size());
        System.out.println("Vocabulario final" + " " +  vocabulario);

        if(vocabulario.contains("ia")){
            System.out.println("El vocabulario contiene la palabra ia");
        }

    }
}
