package unidad2.base.interfaces;

// Interfaz Base: Solo define que algo puede procesar datos
interface Procesable {
    void procesar();
}

// Interfaz Especializada: Además de procesar, ¡esta genera pesos!
public interface CapaNeuronal extends Procesable {
    void actualizarPesos(double learningRate);

    @Override
    default void procesar() {
        System.out.println("Ejecutando procesamiento matricial de capa...");
    }
}