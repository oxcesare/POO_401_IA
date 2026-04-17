package unidad3.ejercicios.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class SensorTracker {
    public static void main(String[] args) {
        Set<String> camarasActivas = new HashSet<>();
        camarasActivas.add("CAM-01");
        camarasActivas.add("CAM-02");
        camarasActivas.add("CAM-03");
        camarasActivas.add("CAM-02");
        camarasActivas.add("CAM-05");
        camarasActivas.add("CAM-01");

        // Metodo remove para desactivar una camara
        camarasActivas.remove("CAM-03");

        // Operaciones de conjuntos (Teoria de Conjuntos aplicada a la IA)
        Set<String> camarasEnMantenimiento = new HashSet<>();
        camarasEnMantenimiento.add("CAM-01");
        camarasEnMantenimiento.add("CAM-05");

        // Método RemoveAll(); Diferencia de conjuntos
        //  (Camaras activas que no estan en mantenimiento)
        camarasActivas.removeAll(camarasEnMantenimiento);
        System.out.println("Camaras activas despues de remover " +
                "las camaras en mantenimiento: " + camarasActivas);

        //Metodo clear para reiniciar la coleccion
        camarasActivas.clear();

    }
}
