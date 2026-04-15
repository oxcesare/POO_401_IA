package unidad3.listas;

import java.util.ArrayList;
import java.util.List;

// Clase que representa los resultados de una época de entrenamiento
class MetricaEntrenamiento {
    int epoca;
    double loss;
    double accuracy;

    public MetricaEntrenamiento(int epoca, double loss, double accuracy) {
        this.epoca = epoca;
        this.loss = loss;
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return String.format("Época %d: [Loss: %.4f | Accuracy: %.2f%%]", epoca, loss, accuracy * 100);
    }
}

public class MonitorIA {
    public static void main(String[] args) {
        // Usamos la Interfaz List (Abstracción) y ArrayList (Implementación)
        // Generics <MetricaEntrenamiento> asegura que solo guardemos métricas
        List<MetricaEntrenamiento> historial = new ArrayList<>();

        // Simulando el proceso de entrenamiento
        historial.add(new MetricaEntrenamiento(1, 0.856, 0.40));
        historial.add(new MetricaEntrenamiento(2, 0.642, 0.58));
        historial.add(new MetricaEntrenamiento(3, 0.310, 0.82));
        historial.add(new MetricaEntrenamiento(4, 0.125, 0.95));

        System.out.println("--- Registro de Aprendizaje del Modelo ---");

        // Iteración sobre la lista: El orden se mantiene tal como se insertó
        for (MetricaEntrenamiento m : historial) {
            System.out.println(m);
        }

        // Acceso aleatorio: Ver la última métrica (el estado actual del modelo)
        MetricaEntrenamiento ultima = historial.get(historial.size() - 1);
        System.out.println("\nEstado Final -> " + ultima);
    }
}