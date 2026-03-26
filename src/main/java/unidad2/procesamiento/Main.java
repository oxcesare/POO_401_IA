package unidad2.procesamiento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<ProcesadorNLP> lista = new ArrayList<ProcesadorNLP>();
        String texto1 = "El modelo es excelente, el, la ,es un modelo muy bueno y genial";

        /**
            String texto2 = "Excelente trabajo, hoy amanecí maravilloso y de muy buen ánimo para estudiar Java.";
            String texto3 = "La clase fue BUENA, el proyecto excelente, pero un detalle técnico me frustró un poco.";
            String texto4 = "Hoy es un día tranquilo, salí a caminar, tomé café y organicé mi código.";
            String texto5 = "Un sistema robusto, bien documentado y con pruebas, siempre da confianza al equipo.";
         *
         */

        lista.add(new ProcesadorAnalisisSentimiento());
        lista.add(new ProcesadorSimple());

        for (ProcesadorNLP procesar : lista) {
            procesar.cargarTexto(texto1);
            procesar.procesarTexto();
            Object resultado = procesar.transformarParaModelo();
            System.out.println("Resultado: " + resultado);
            System.out.println("Modelo" + " "  + procesar.getClass().getSimpleName());

        }
    }
}
