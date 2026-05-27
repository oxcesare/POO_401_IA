package certificacion.fase2.practica09;

public class Valores {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(42);
        Long ln = Long.valueOf(42);
        Double d = Double.valueOf(42);

        System.out.println(ln.equals(42));
        System.out.println(d.equals(ln));
        System.out.println(i.equals(d));

    }
}