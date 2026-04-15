package unidad3.contextualizacion.practica01;

import java.util.List;
import java.util.Map;

public class MotorRecomendacion implements ProcesadorDeDatos<Integer, Integer, String> {

    @Override
    public void procesarSecuencia(List<Integer> lista) { /* No aplica */ }

    @Override
    public void procesarMapa(Map<Integer, String> preferenciasUsuarios) {
        System.out.println("Buscando intereses para el usuario...");
        preferenciasUsuarios.forEach((id, pref) ->
                System.out.println("Usuario " + id + " prefiere: " + pref));
    }
}