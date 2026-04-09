package unidad3.modelado.restaurante;

public class Restaurante {
    private String nombre;
    private String tipoDeComida;
    private int calificacion;


    public void abrir() {
        System.out.println("El Restaruante esta abierto");
    }


    public static void main(String[] args) {
        Restaurante miRestaurante = new Restaurante();
        miRestaurante.abrir();

        Restaurante miRestaurante2 = new Restaurante();
        miRestaurante2.abrir();

    }


}
