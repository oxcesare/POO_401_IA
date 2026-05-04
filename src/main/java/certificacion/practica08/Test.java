package certificacion.practica08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {


        //crear una lista de String
        List<String> lsElements = new ArrayList<>();
        lsElements.add("1");
        lsElements.add("4");
        lsElements.add("3");
        lsElements.add("4");
        lsElements.add("5");
        lsElements.add("4");

        //Imprimmir los que comiencen con 1
        lsElements.stream().filter(s -> s.equals("4")).forEach(System.out::println);

        System.out.println("****** Otro tipo de implementación ************************");
        //Puedes crear un Predicate para encapsular ese filter
        Predicate<String> p = s -> s.equals("4");
        lsElements.stream().filter(p).forEach(System.out::println);


    }
}
