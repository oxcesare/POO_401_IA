package unidad3.map;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokens {
    public static void main(String[] args) {
        String[] tokens = {"ia", "python", "ia", "redes", "python", "ia"};

        // 1. Instanciación: K=String (Palabra), V=Integer (Frecuencia)
        Map<String, Integer> frecuencias = new HashMap<>();

        for (String t : tokens) {
            // 2. Método getOrDefault(): Evita NullPointerException si la clave no existe
            // Si la palabra no está, inicia en 0 y le suma 1
            frecuencias.put(t, frecuencias.getOrDefault(t, 0) + 1);
        }

        // 3. Método keySet(): Obtener todas las palabras únicas (el vocabulario)
        System.out.println("Vocabulario detectado: " + frecuencias.keySet());

        // 4. Método entrySet(): Iterar sobre pares clave-valor (Eficiente para reportes)
        for (Map.Entry<String, Integer> entrada : frecuencias.entrySet()) {
            System.out.println("Token: " + entrada.getKey() + " | Frecuencia: " + entrada.getValue());
        }
    }
}

/**
 * classDiagram
 *     class Map~K,V~ {
 *         <<interface>>
 *         +put(K key, V value) V
 *         +getOrDefault(Object key, V defaultValue) V
 *         +keySet() Set~K~
 *         +entrySet() Set~Entry~K,V~~
 *     }
 *
 *     class Entry~K,V~ {
 *         <<interface>>
 *         +getKey() K
 *         +getValue() V
 *     }
 *
 *     class HashMap~K,V~ {
 *         +put(K key, V value) V
 *         +getOrDefault(Object key, V defaultValue) V
 *     }
 *
 *     ContadorTokens --> Map : utiliza
 *     HashMap ..|> Map : implementa
 *     Map *-- Entry : contiene
 */