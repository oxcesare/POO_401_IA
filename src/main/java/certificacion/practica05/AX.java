package certificacion.practica05;

public class AX {

    static int[] x = new int[1];

    /**
     * El bloque estatico siempre se ejecuta antes
     * que todo lo demás
     */
    static {

        x[0] = 10;
    }

    public static void main(String[] args) {
        AX ax = new AX();
        System.out.println(x[0]);
    }
}
