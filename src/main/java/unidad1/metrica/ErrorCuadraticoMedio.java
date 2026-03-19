package unidad1.metrica;

public class ErrorCuadraticoMedio extends Metrica {

    public ErrorCuadraticoMedio(String tipoMetrica) {
        super(tipoMetrica);
    }

    @Override
    public void calcularResultado(double metrica) {
        System.out.println("Calculando Error Cuadratico Medio con ...." + metrica);
    }
}
