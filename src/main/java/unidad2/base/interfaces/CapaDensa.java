package unidad2.base.interfaces;

public class CapaDensa implements CapaNeuronal {

    private double[][] pesos;
    private String nombre;

    public CapaDensa(String nombre) {
        this.nombre = nombre;
        // Imaginemos la inicialización de pesos aquí
    }

    @Override
    public void actualizarPesos(double learningRate) {
        System.out.println("Actualizando pesos de " + nombre + " usando SGD con tasa: " + learningRate);
        // Lógica matemática de optimización
    }

    // Nota: No es obligatorio sobreescribir procesar() si ya tiene un 'default'
    // en la interfaz, pero podemos hacerlo para personalizarlo.
    @Override
    public void procesar() {
        System.out.println("[" + nombre + "] Realizando producto punto entre entrada y pesos.");
    }
}