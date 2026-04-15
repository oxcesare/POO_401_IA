package unidad3.contextualizacion.practica01;

import java.util.List;
import java.util.Map;

public class ProcesadorVision implements ProcesadorDeDatos<String, String, String> {

    @Override
    public void procesarSecuencia(List<String> fotogramas) {
        System.out.println("Procesando " + fotogramas.size() + " fotogramas en orden...");
        fotogramas.forEach(f -> System.out.println("Analizando: " + f));
    }

    @Override
    public void procesarMapa(Map<String, String> configuracion) {
        // En visión, quizás no necesitamos mapa, pero cumplimos el contrato
    }
}