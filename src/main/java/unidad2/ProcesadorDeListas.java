package unidad2;

import java.util.Scanner;

public class ProcesadorDeListas {

    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Peras", "Uvas", "Naranjas"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas" + " " + frutas[i]);
        }

        int contador = 1;
        boolean bandera = true;

        while (contador < frutas.length) {
            if (frutas[contador].contains("P")) {
                System.out.println("Fruta encontrada" + frutas[contador]);
                break;
            }
            contador++;
        }

        Scanner cs = new Scanner(System.in);
        System.out.println("Ingresa el nombre de una fruta");
        String fruta = cs.nextLine();
        System.out.println("La fruta ingresa es " + fruta);

        // Ciclo While para validar la fruta que ingreso el usuario y saber la posicion

        int posicion = 0;
        boolean encontrado = false;

        do {
            if (frutas[posicion].equalsIgnoreCase(fruta)) {
                encontrado = true;
                System.out.println("Fruta encontrada en la posicion " + posicion);
            }
            posicion++;
        } while (!encontrado && posicion < frutas.length);

        if (!encontrado) {
            System.out.println("Fruta no encontrada");
        }


    }
}
