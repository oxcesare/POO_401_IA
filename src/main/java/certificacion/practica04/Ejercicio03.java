package certificacion.practica04;

public class Ejercicio03 {

    static boolean a;
    static boolean b;
    static boolean c;

    public static void main(String[] args) {

        boolean bool = (a=true) || (b =true) && (c=true);
        System.out.println(a +","+ b + ","+c );

        /**
         * Por default en java boolean es false
         *
         * || si la primera condicion es true ya no se evalua
         * la segunda condicion, por lo tanto b y c no se asignan a true
         */

    }
}
