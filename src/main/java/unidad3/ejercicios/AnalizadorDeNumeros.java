package unidad3.ejercicios;

import java.util.Scanner;

public class AnalizadorDeNumeros {
    public static void main(String[] args) {
        // Tarea 1: Suma de rango con for [cite: 32]
        int suma = 0;
        for (int i = 1; i <= 100; i++) { // [cite: 33]
            suma += i;
        }
        System.out.println("La suma de 1 a 100 es: " + suma); // [cite: 34]

        // Tarea 2: Primer número > 50 con while [cite: 35]
        int num = 1; // [cite: 37]
        while (num <= 50) { // [cite: 36]
            num++;
        }
        System.out.println("El primer número mayor a 50 es: " + num); // [cite: 38]

        // Tarea 3: Validar contraseña con do-while [cite: 39]
        Scanner sc = new Scanner(System.in);
        String passwordCorrecta = "java123";
        boolean esIncorrecta; // Bandera para el ciclo [cite: 43]

        do {
            System.out.print("Ingresa la contraseña: "); // [cite: 41]
            String entrada = sc.nextLine();
            esIncorrecta = !entrada.equals(passwordCorrecta); // [cite: 42]
        } while (esIncorrecta);

        System.out.println("Contraseña aceptada.");
        sc.close();
    }
}