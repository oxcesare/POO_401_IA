package unidad3.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {

    public static void main(String[] args) {

        double nota1 = 0d;
        double nota2 = 0d;
        double promedio = 0d;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");

        try {
            nota1 = sc.nextDouble();
            System.out.println("Ingresa la segunda nota");
            nota2 = sc.nextDouble();
            promedio = nota1 + nota2 / 2;
            System.out.println("El promedio es " + promedio);
        } catch (InputMismatchException e) {
            System.out.println("Error al ingresar la nota, por favor ingrese un numero valido");
        } finally {
            sc.close();
            System.out.println("Recursos liberados");
        }

    }
}
