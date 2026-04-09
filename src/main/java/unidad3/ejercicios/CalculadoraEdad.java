package unidad3.ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraEdad {
    public static void main(String[] args) {
        int anioActual = 2025; // [cite: 94, 135]
        Scanner scanner = new Scanner(System.in); // [cite: 95, 136]

        try { // [cite: 97, 138]
            System.out.print("Ingresa tu año de nacimiento: ");
            int anioNacimiento = scanner.nextInt(); // [cite: 96, 137]

            // Si la entrada es válida [cite: 98, 139]
            int edad = anioActual - anioNacimiento; // [cite: 99, 140]
            System.out.println("Tu edad es: " + edad + " años."); // [cite: 100, 141]

        } catch (InputMismatchException e) { // [cite: 101, 102, 142, 143]
            System.out.println("Error: Debes ingresar un número entero."); // [cite: 103, 144]
        } finally {
            scanner.close(); // Liberación de recursos [cite: 104, 145]
            System.out.println("Recursos liberados.");
        }
    }
}