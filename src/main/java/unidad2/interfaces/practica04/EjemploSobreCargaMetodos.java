package unidad2.interfaces.practica04;

import unidad1.dataset.alexis.Dataset;

public class EjemploSobreCargaMetodos {

    public void entrenar(Dataset[] datasets) {
        System.out.println("Metodo entrenar con 1 parametro");
    }

    public void entrenar(Dataset[] datasets, int epoca) {
        System.out.println("Metodo entrenar sobrecargado");
    }
}
