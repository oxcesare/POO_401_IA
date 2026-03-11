package unidad1.metrica;

public class Accuracy extends Metrica {

    public Accuracy(String tipoMetrica) {
        super(tipoMetrica);
    }

    @Override
    public void calcularResultado(double metrica) {
        System.out.println("Calculando Accuracy...." + metrica);
    }
}
