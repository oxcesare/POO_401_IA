package certificacion.fase1.practica01;

import java.util.Locale;

public class Test {

    public static void main(String[] args) {

        /**
         * Recordar el concepto de que String es inmutable
         */
        String a = "a";
        a.toUpperCase();
        System.out.println(a);

        boolean x = "String".replace('g','g') == new  String("String").replace('g','g');
        System.out.println(x);

        String c = "String";



    }
}
