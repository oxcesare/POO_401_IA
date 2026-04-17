package unidad3.contextualizacion.ejambres.agentes;

import java.util.*;

// Clases de soporte para el contexto de IA
class Movimiento { /* Coordenadas, timestamp */ }
class Mision { /* Parámetros, prioridad */ }

// Interfaz del contrato de monitoreo
public interface MonitorDeAgentes {
    void registrarMovimiento(UUID agenteId, Movimiento mov);
    void registrarAgente(UUID agenteId);
    void asignarMision(UUID agenteId, Mision mision);
}
