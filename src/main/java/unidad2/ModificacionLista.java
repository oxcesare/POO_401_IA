package unidad2;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ModificacionLista {

    public static void main(String[] args) {


        List<Integer> ls = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        try {
            for (Integer i : ls) {
                System.out.println(i);
                if (i == 3) {
                    ls.remove(1);
                }
            }

        } catch (ConcurrentModificationException e) {
            System.out.println("No se puede modificar la lista: " + e.getMessage());
        }
        System.out.println("Nuestro flujo puedo continuar sin problemas");

    }
}
