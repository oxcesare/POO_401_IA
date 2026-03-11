package unidad1.polimorfismo.practica_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<OptimizadorIA> optimizadorIAS = new ArrayList<>();
        optimizadorIAS.add(new AlgoritmoGenetico());
        optimizadorIAS.add(new DescensoGradiante());

        for (OptimizadorIA optimizador : optimizadorIAS) {
            optimizador.ajustarParametros();
        }
    }
}
