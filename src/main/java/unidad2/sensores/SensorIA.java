package unidad2.sensores;

public abstract class SensorIA {

    private String modelo;
    private double consumoEnergia;


    public SensorIA(String modelo, double consumoEnergia){
        this.modelo=modelo;
        this.consumoEnergia=consumoEnergia;

    }

    public abstract void leerDatos();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
}
