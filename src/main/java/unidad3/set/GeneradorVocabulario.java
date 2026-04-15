package unidad3.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class GeneradorVocabulario {
    public static void main(String[] args) {
        // Simulamos una lista de tokens con muchas repeticiones
        String texto = "el modelo de ia es un modelo bueno porque el modelo aprende";
        String[] tokens = texto.split(" ");

        // 1. Instanciación: HashSet ofrece la mayor velocidad de búsqueda y almacenamiento
        Set<String> vocabulario = new HashSet<>();

        // 2. Método add(): Agregamos todos los tokens
        // Si la palabra ya existe, el Set simplemente la ignora.
        for (String t : tokens) {
            vocabulario.add(t);
        }

        // 3. Método size(): Nos da la cardinalidad del vocabulario (tokens únicos)
        System.out.println("Total de palabras procesadas: " + tokens.length);
        System.out.println("Tamaño del vocabulario único: " + vocabulario.size());

        // 4. Método contains(): Verificación instantánea (O(1))
        // Es mucho más rápido que buscar en una List
        if (vocabulario.contains("ia")) {
            System.out.println("El concepto 'ia' está presente en el vocabulario.");
        }

        System.out.println("Palabras únicas: " + vocabulario);
    }
}