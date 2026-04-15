package unidad3.contextualizacion.practica01;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Crear un procesador de visión
        ProcesadorVision vision = new ProcesadorVision();
        vision.procesarSecuencia(List.of("Fotograma1.jpg", "Fotograma2.jpg", "Fotograma3.jpg"));

        // Crear un motor de recomendación
        MotorRecomendacion recomendacion = new MotorRecomendacion();
        recomendacion.procesarMapa(Map.of(1, "Ciencia ficción", 2, "Comedia", 3, "Drama"));
    }
}
