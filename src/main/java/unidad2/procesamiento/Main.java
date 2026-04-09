package unidad2.procesamiento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String texto = "Un sistema robusto, bien documentado y con pruebas, siempre da confianza al equipo.";

        List<ProcesadorNLP> lista = new ArrayList<ProcesadorNLP>();


        /**
            String texto = "Excelente trabajo, hoy amanecí maravilloso y de muy buen ánimo para estudiar Java.";
            String texto = "La clase fue BUENA, el proyecto excelente, pero un detalle técnico me frustró un poco.";
            String texto = "Hoy es un día tranquilo, salí a caminar, tomé café y organicé mi código.";
            String texto = "Un sistema robusto, bien documentado y con pruebas, siempre da confianza al equipo.";
            String texto = "El modelo es excelente, el, la ,es un modelo muy bueno y genial";
         *
         */

        lista.add(new ProcesadorAnalisisSentimiento());
        lista.add(new ProcesadorSimple());
        lista.add(new ProcesadorCifradoIA());

        for (ProcesadorNLP procesar : lista) {
            procesar.cargarTexto(texto);
            procesar.procesarTexto();
            Object resultado = procesar.transformarParaModelo();
            System.out.println("Resultado: " + resultado);
            System.out.println("Modelo" + " "  + procesar.getClass().getSimpleName());

        }
    }
}
