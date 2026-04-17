package unidad3.ejercicios.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSetManager {

    public static void main(String[] args) {

        List<String> dataset = new ArrayList<>();
        dataset.add("gato_01.jpg");
        dataset.add("gato_02.jpg");
        dataset.add("gato_03.jpg");
        dataset.add("gato_04.jpg");
        dataset.add("gato_05.png");

        System.out.println("data set original" + " " +  dataset);

        //Metodo para saber el tamaño de la lista
        System.out.println("Tamaño de la lista (Dataset)" + dataset.size());

        // Saber si la lista contiene un elemento en especifico
        // remove para eliminar una posicion en especifico
        if(dataset.contains("gato_05.png")){
            int index = dataset.indexOf("gato_05.png");
            System.out.println("lo encontro" + " " +  index);
            dataset.remove(index);
        }

        // Creacion de una sublista
        List<String> subLista = dataset.subList(0,3);
        System.out.println("SubLista "+  subLista);

        // Para reemplazar un elemento en especifico
        dataset.set(0, dataset.get(0).replace(".jpg", ".tmp)"));
        System.out.println("dataSet"+ " " +  dataset);

        // Metodo clear
        System.out.println("Ultimo elemento "+  dataset.get(0));
        dataset.clear();
        System.out.println("Tamaño de la lista actual "+  " " +  dataset.size());

    }
}
