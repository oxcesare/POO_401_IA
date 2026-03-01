package unidad1.elementos.robot;

public class Bateria {

    private float PorcentajeCarga;

    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        bateria.setPorcentajeCarga(57.7f);
        bateria.getPorcentajeCarga();
        bateria.nivelCarga(44.5f);
        System.out.println("Porcentaje de Batería: "+ bateria.PorcentajeCarga);
    }

    public void nivelCarga(Float porcentaje){
        this.PorcentajeCarga = porcentaje;
    }

    public float getPorcentajeCarga() {
        return PorcentajeCarga;
    }

    public void setPorcentajeCarga(float porcentajeCarga) {
        PorcentajeCarga = porcentajeCarga;
    }
}
