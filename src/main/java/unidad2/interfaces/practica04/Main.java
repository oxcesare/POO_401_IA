package unidad2.interfaces.practica04;

import unidad1.dataset.alexis.Dataset;

public class Main {

    public static void main(String[] args) {

        EjemploSobreCargaMetodos carga = new EjemploSobreCargaMetodos();

        Dataset[] datasets = new Dataset[5];
        int epoca = 1;

        carga.entrenar(datasets, epoca); //metodo sobrecargado
        carga.entrenar(datasets); //metodo sobrecargado

    }
}
