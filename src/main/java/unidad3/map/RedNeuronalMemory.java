package unidad3.map;

import java.util.HashMap;
import java.util.Map;

public class RedNeuronalMemory {
    public static void main(String[] args) {
        Map<String, Double> pesos = new HashMap<>();

        // 5. Método put(): Inicializar pesos
        pesos.put("w1", 0.72);
        pesos.put("w2", -0.15);
        pesos.put("bias", 1.0);

        // 6. Método containsKey(): Verificar si un parámetro existe antes de operar
        if (pesos.containsKey("w1")) {
            // 7. Método replace(): Actualizar un peso tras el Backpropagation
            pesos.replace("w1", 0.75);
        }

        // 8. Método values(): Si solo nos importan los números para una suma ponderada
        double sumaPesos = 0;
        for (Double valor : pesos.values()) {
            sumaPesos += valor;
        }

        System.out.println("Suma total de parámetros: " + sumaPesos);

        // 9. Método remove(): Eliminar una neurona muerta (Pruning)
        pesos.remove("w2");
    }
}


/**
 * classDiagram
 *     class RedNeuronalMemory {
 *         +main(String[] args) void$
 *     }
 *
 *     class Map~K,V~ {
 *         <<interface>>
 *         +put(K key, V value) V
 *         +containsKey(Object key) boolean
 *         +replace(K key, V value) V
 *         +values() Collection~V~
 *         +remove(Object key) V
 *     }
 *
 *     class HashMap~K,V~ {
 *         +put(K key, V value) V
 *         +containsKey(Object key) boolean
 *     }
 *
 *     RedNeuronalMemory --> Map : utiliza
 *     HashMap ..|> Map : implementa
 */