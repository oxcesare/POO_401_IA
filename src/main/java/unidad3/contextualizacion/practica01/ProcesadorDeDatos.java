package unidad3.contextualizacion.practica01;

import java.util.List;
import java.util.Map;

// Contrato estándar para cualquier flujo de datos en IA
public interface ProcesadorDeDatos<T, K, V> {

    // Método para manejar secuencias ordenadas (List)
    void procesarSecuencia(List<T> elementos);

    // Método para manejar asociaciones clave-valor (Map)
    void procesarMapa(Map<K, V> datosAsociativos);
}