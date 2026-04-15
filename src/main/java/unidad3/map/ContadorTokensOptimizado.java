package unidad3.map;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokensOptimizado {
    public static void main(String[] args) {
        String[] tokens = {"ia", "python", "ia", "redes", "python", "ia"};

        Map<String, Integer> frecuencias = new HashMap<>();

        for (String t : tokens) {
            // El método mágico: merge
            // Si "t" no existe, pone 1.
            // Si "t" ya existe, suma el valor viejo (v) + el nuevo (1).
            frecuencias.merge(t, 1, (valorViejo, valorNuevo) -> valorViejo + valorNuevo);
        }

        System.out.println("--- Frecuencias con método merge() ---");
        frecuencias.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}

/**
 * classDiagram
 *     class ContadorTokensOptimizado {
 *         +main(String[] args) void$
 *     }
 *
 *     class Map~K,V~ {
 *         <<interface>>
 *         +merge(K key, V value, BiFunction remappingFunction) V
 *         +forEach(BiConsumer action) void
 *     }
 *
 *     class HashMap~K,V~ {
 *         +merge(K key, V value, BiFunction remappingFunction) V
 *     }
 *
 *     ContadorTokensOptimizado --> Map : utiliza
 *     HashMap ..|> Map : implementa
 */
