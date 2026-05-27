package certificacion.fase2.practica05;

import java.util.ArrayList;
import java.util.List;

public class EjemploWrapper {
    public static void main(String[] args) {

        // 1. El Primitivo: Es solo un valor puro en memoria (Stack)
        int numeroPrimitivo = 10;

        // 2. El Envoltorio: Es un objeto completo en el Heap
        // Java hace "Autoboxing" de forma automática (mete el 10 dentro de la caja Integer)
        Integer numeroObjeto = numeroPrimitivo;

        // 3. ¿Para qué sirve? Las colecciones de Java NO aceptan primitivos
        // List<int> listaErrores = new ArrayList<>(); // ESTO NO COMPILA

        List<Integer> listaCorrecta = new ArrayList<>(); //  COMPILA PERFECTAMENTE
        listaCorrecta.add(numeroObjeto);

        // 4. Los envoltorios te dan superpoderes (Métodos utilitarios)
        String texto = "25";
        int convertido = Integer.parseInt(texto); // Convierte texto a número

        System.out.println("Número convertido: " + convertido);
        System.out.println("Valor máximo de un Integer: " + Integer.MAX_VALUE);
    }
}