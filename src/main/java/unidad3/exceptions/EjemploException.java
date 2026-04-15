package unidad3.exceptions;

import java.util.ArrayList;
import java.util.List;

public class EjemploException {

    public static void main(String[] args) {

        Alumno a = new Alumno();

        a.setMatricula("UX99992353");
        System.out.println(a.getMatricula());

        //Ejemplo de objeto null
        Alumno b = null;


        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("A");
        lista.add("A");

        try {
            System.out.println(lista.get(4));
        }catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }

    }
}
