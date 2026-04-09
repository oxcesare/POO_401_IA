package unidad2.ejercicios.base;

import java.util.Scanner;

public class CalculadoraEdadV2 {


    public static void main(String[] args) {

        int anioActual = 2026;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa tu año de nacimiento: ");
            int anioNacimiento = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e); // Muestra el tipo y mensaje
            System.out.println("Clase de la excepción: " + e.getClass().getName());
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("Causa: " + e.getCause());
            System.out.println("Mensaje localizado: " + e.getLocalizedMessage());
            e.printStackTrace(); // Muestra el stack trace completo
        } finally {
            System.out.println("Siempre se ejecuta");
            sc.close();
        }
    }
}
