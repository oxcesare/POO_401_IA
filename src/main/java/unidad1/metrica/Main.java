package unidad1.metrica;

public class Main {

    public static void main(String[] args) {

        Accuracy ac = new Accuracy("Accuracy");
        ac.calcularResultado(90.5);

        ErrorCuadraticoMedio er = new ErrorCuadraticoMedio("Erro");
        er.calcularResultado(100.00);


        //Polimorfismo
        Metrica m1 = new Accuracy("Accuracy");
        m1.calcularResultado(18.5);

    }
}
