package certificacion.fase16.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// 1. El objeto que representa los datos a persistir
class Alumno {
    String nombre;
    String matricula;

    Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno{Nombre: '" + nombre + "', Matrícula: '" + matricula + "'}";
    }
}

public class SimuladorPersistencia {

    // 2. Nuestra "Base de Datos" simulada en memoria
    private static final List<Alumno> BASE_DE_DATOS = new ArrayList<>();

    public static void main(String[] args) {

        // 3. Definición del Consumer: Recibe un Alumno y lo "guarda" (agrega a la lista)
        Consumer<Alumno> guardarEnBD = alumno -> {
            BASE_DE_DATOS.add(alumno);
            System.out.println("[BD INFO] Guardado con éxito: " + alumno.nombre);
        };

        // 4. Creamos datos de prueba
        Alumno alumno1 = new Alumno("César", "AI-2026-01");
        Alumno alumno2 = new Alumno("Ricardo", "AI-2026-02");

        // 5. Ejecutamos la simulación usando el método accept()
        System.out.println("--- Iniciando Persistencia Funcional ---");
        guardarEnBD.accept(alumno1);
        guardarEnBD.accept(alumno2);

        // 6. Validamos que los datos realmente "persistieron" en nuestra simulación
        System.out.println("\n--- Contenido Actual de la Base de Datos ---");
        BASE_DE_DATOS.forEach(System.out::println);
    }
}
