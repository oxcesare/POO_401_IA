package certificacion.fase10.practica01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        int i=0;
        for (Integer integer : lista) {
            System.out.println(integer);
            i++;
        }

        Integer [] array = new Integer[lista.size()];

        for (Integer integer : array) {

        }

        Map<String, Integer> mapa = Map.of("uno", 1, "dos", 2, "tres", 3);

        //Iterar sobre el map
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey());
        }

    }
}
