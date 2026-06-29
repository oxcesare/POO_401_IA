package certificacion.fase16.interfaces;

import java.util.function.Function;

class AlumnoRequest {
    String nombreCompleto;
    String matriculaInput;

    AlumnoRequest(String nombreCompleto, String matriculaInput) {
        this.nombreCompleto = nombreCompleto;
        this.matriculaInput = matriculaInput;
    }
}
class AlumnoEntidad {
    String nombre;
    String apellido;
    String matriculaCompleta;

    AlumnoEntidad(String nombre, String apellido, String matriculaCompleta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaCompleta = matriculaCompleta;
    }

    @Override
    public String toString() {
        return "AlumnoEntidad{Nombre: " + nombre + ", Apellido: " + apellido + ", Matrícula: " + matriculaCompleta + "}";
    }
}

public class SimuladorTransformacion {
    public static void main(String[] args) {

        // 3. Definición de la Function<T, R>
        // T = AlumnoRequest (Entrada)
        // R = AlumnoEntidad (Salida)
        Function<AlumnoRequest, AlumnoEntidad> mapearAEntidad = request -> {
            // Lógica de transformación: separamos el nombre y estandarizamos la matrícula
            String[] partes = request.nombreCompleto.split(" ");
            String nombre = partes[0];
            String apellido = partes.length > 1 ? partes[1] : "";
            String matriculaLimpia = "ALUMNO-" + request.matriculaInput.trim();

            // Retornamos el nuevo objeto transformado (Tipo R)
            return new AlumnoEntidad(nombre, apellido, matriculaLimpia);
        };

        // 4. Objeto de prueba (Materia prima)
        AlumnoRequest inputFrontend = new AlumnoRequest("César Alducin", " 45678 ");

        // 5. Ejecutamos la transformación usando el método apply()
        System.out.println("--- Procesando Datos de Entrada ---");
        AlumnoEntidad entidadBD = mapearAEntidad.apply(inputFrontend);

        // 6. Resultado final transformado
        System.out.println(entidadBD);
    }
}