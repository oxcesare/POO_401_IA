package unidad3.ejercicios.map;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokens {

    public static void main(String[] args) {
        // arreglo de cadenas
        String [] tokens = {"ia", "python", "redes", "neuronas","ia","neuronas"};

        // Instanciar Map (interface) la implementaciones HashMap
        Map<String, Integer> frecuencia = new HashMap<>();

        // iterar el arreglo y llenar el mapa de frecuencias
        for (String d : tokens){
            frecuencia.put(d,frecuencia.getOrDefault(d,0)+1);
        }

        // Obtener las palabras unicas
        System.out.println("Voculabario" + "   " + frecuencia.keySet());

        // Iteramos el map
        for(Map.Entry<String, Integer> entrada: frecuencia.entrySet()){
            System.out.println("Token: "+ " " +  entrada.getKey() +
                    " " +  " | Frecuencia: "+  entrada.getValue());
        }

    }
}
