package unidad3.figuras;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[2];
        figuras[0] = new Circulo(5.0);         // Radio = 5
        figuras[1] = new Rectangulo(4.0, 3.0); // Base = 4, Altura = 3

        for (FiguraGeometrica figura : figuras) {
            figura.mostrarNombre();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println();
        }

        System.out.println("Implementacion 2 ");

        RectanguloV2 rectanguloV2 = new RectanguloV2();
        rectanguloV2.setBase(6.0);
        rectanguloV2.setAltura(4.8);

        System.out.println("Calcular area version 2.0" + " " + rectanguloV2.calcularArea());


    }
}
