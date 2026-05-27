package certificacion.fase2.practica05;

public class Test {

    public static void main(String[] args) {

        Integer i = Integer.valueOf(42);
        Long ln = Long.valueOf(42);
        Double d = Double.valueOf(42);


        /**
         * Se utiliza == para comparar objetos cuyas referencias
         * a puntan al mismo objeto no valor
         */

        // Si quisieramos comparar seria
        System.out.println(i.equals(ln)); // false
        System.out.println(ln.equals(d));

    }
}
