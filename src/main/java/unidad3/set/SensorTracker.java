package unidad3.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class SensorTracker {
    public static void main(String[] args) {
        Set<String> camarasActivas = new HashSet<>();

        // Simulación de ráfagas de señales (IDs duplicados)
        camarasActivas.add("CAM-01");
        camarasActivas.add("CAM-02");
        camarasActivas.add("CAM-01"); // Duplicado: El Set lo ignora
        camarasActivas.add("CAM-03");
        camarasActivas.add("CAM-02"); // Duplicado: El Set lo ignora

        // 5. Método remove(): Desactivar un agente
        camarasActivas.remove("CAM-03");

        // 6. Operaciones de Conjuntos (Teoría de Conjuntos aplicada a IA)
        Set<String> camarasMantenimiento = new HashSet<>();
        camarasMantenimiento.add("CAM-01");
        camarasMantenimiento.add("CAM-05");

        // Método removeAll(): Diferencia de conjuntos (Cámaras activas que NO están en mantenimiento)
        camarasActivas.removeAll(camarasMantenimiento);

        System.out.println("Cámaras operativas y seguras: " + camarasActivas);

        // 7. Método clear(): Reiniciar el estado del sistema
        camarasActivas.clear();
    }
}