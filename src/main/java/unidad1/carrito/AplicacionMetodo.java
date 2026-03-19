package unidad1.carrito;

public class AplicacionMetodo extends FuncionesVehiculo {

    @Override
    public String frenar() {
        return "El vehículo está frenando.";
    }

    @Override
    public String acelerar() {
        return "El vehículo está acelerando.";
    }

    public static void main(String[] args) {
        AplicacionMetodo miCarrito = new AplicacionMetodo();
        System.out.println(miCarrito.acelerar());
        System.out.println(miCarrito.frenar());
    }
}