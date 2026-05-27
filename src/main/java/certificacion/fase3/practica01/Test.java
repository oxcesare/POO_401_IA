package certificacion.fase3.practica01;

import java.util.ArrayList;

public class Test {

    static boolean bol;
    public static void main(String[] args) {

        System.out.println(bol);

        ArrayList<Double>  list = new  ArrayList<>();
        System.out.println(list);
        System.out.println(list.indexOf(1.0));
        System.out.println(list.contains("string"));

        Double d = list.get(list.size() - 1);
    }
}
