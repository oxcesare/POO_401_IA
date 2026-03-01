package unidad1.abstraccion;

public abstract class ModeloIA {

    protected String nombre;

    public ModeloIA(String nombre) {
        this.nombre = nombre;
    }

    public abstract void procesarEntrada(String entrada);
}
