package unidad3.contextualizacion.ejambres.agentes;

import java.util.*;

public class ControlEnjambre implements MonitorDeAgentes {


    // List: Historial ordenado (historial total de todos los agentes)
    private List<Movimiento> historialGlobal = new ArrayList<>();

    // Set: Autenticación única (IDs de agentes autorizados)
    private Set<UUID> agentesActivos = new HashSet<>();

    // Map: Despachador de tareas (Acceso O(1) por ID)
    private Map<UUID, Mision> despachador = new HashMap<>();

    @Override
    public void registrarAgente(UUID id) {
        if (agentesActivos.add(id)) {
            System.out.println("Agente autenticado: " + id);
        } else {
            System.out.println("Intento de suplantación detectado: " + id);
        }
    }

    @Override
    public void registrarMovimiento(UUID id, Movimiento mov) {
        if (agentesActivos.contains(id)) {
            historialGlobal.add(mov);
        }
    }

    @Override
    public void asignarMision(UUID id, Mision mision) {
        // Método put: Asigna o sobrescribe misión actual
        despachador.put(id, mision);
    }
}
