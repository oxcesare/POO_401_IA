package unidad2.sensores;

public class Percepcion extends SensorIA {


    @Override
    public void leerDatos() {
        System.out.println("Escaneando entorno 360°... Generando nube de puntos láser." +
        "Consumo de Energia:" + super.consumoEnergia + " Modelo: "
                + super.modelo);
    }
}
