package unidad2.ejercicios.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {

    public static void main(String[] args) {

        double nota1 = 0D;
        double nota2 = 0D;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa la primera nota");
            nota1 = sc.nextDouble();

            System.out.println("Ingresa la segunda nota");
            nota2 = sc.nextDouble();

            double promedio = (nota1 + nota2) / 2;
            System.out.println("Promedio" + "  " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("Solo ingresar numeros" + e.getCause());
        } finally {
            System.out.println("Liberando recursos");
            sc.close();
        }
    }
}
