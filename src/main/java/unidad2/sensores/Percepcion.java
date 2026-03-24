package unidad2.sensores;

public class Percepcion extends SensorIA {


    public Percepcion(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Escaneando entorno 360°... Generando nube de puntos láser." +
        "Consumo de Energia:" + super.getConsumoEnergia() + " Modelo: "
                + super.getModelo());
    }
}
