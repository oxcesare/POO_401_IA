package unidad1.analizador;

abstract class MotorIA {
    // Atributos encapsulados (Protegidos de acceso externo indebido)
    private String nombreModelo;
    private double precision;

    public MotorIA(String nombre, double precision) {
        this.nombreModelo = nombre;
        this.precision = precision;
    }

    // GETTERS Y SETTERS (Encapsulamiento)
    public String getNombre() {
        return nombreModelo;
    }

    // TODO: Implementar el setter para precision con una validación:
    // La precisión no puede ser menor a 0.0 ni mayor a 1.0.

    // EL QUÉ: Contrato abstracto
    // TODO: Define un método abstracto llamado 'analizar' que reciba un String.
}