package unidad1.abstraccion;

public class ReconocimientoFacil extends ModeloIA {

    public ReconocimientoFacil() {
        super("Vision 1.0");
    }

    @Override
    public void procesarEntrada(String entrada) {
        System.out.println("Cargando datos.....");
        System.out.println("Extrayendo datos.....");
        System.out.println("Comparando Vector.....");
    }
}
