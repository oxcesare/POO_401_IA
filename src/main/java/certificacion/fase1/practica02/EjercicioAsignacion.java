package certificacion.fase1.practica02;

public class EjercicioAsignacion {
    public static void main(String[] args) {

        int n = m2(2);
        n *= 2 + n++;
        System.out.println(n);

    }

    public static int m2(int x) {
        return x-- + 1;
    }
}