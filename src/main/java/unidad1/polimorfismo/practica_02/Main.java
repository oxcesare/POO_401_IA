package unidad1.polimorfismo.practica_02;

import unidad1.polimorfismo.practica_02.AlgoritmoGenetico;
import unidad1.polimorfismo.practica_02.DescensoGradiante;
import unidad1.polimorfismo.practica_02.OptimizadorIA;

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
