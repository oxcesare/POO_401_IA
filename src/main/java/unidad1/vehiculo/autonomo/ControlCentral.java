package unidad1.vehiculo.autonomo;

public class ControlCentral {

    public static void main(String[] args) {

        //Lista de Vehiculos Autonomos
        VehiculoAutonomo[] vehiculos = new VehiculoAutonomo[2];
        vehiculos[0] = new Rover();
        vehiculos[1] = new Dron();

        //Calcular ruta para cada vehiculo
        for (VehiculoAutonomo vehiculo : vehiculos) {
            vehiculo.calcularRuta();
        }


    }
}
