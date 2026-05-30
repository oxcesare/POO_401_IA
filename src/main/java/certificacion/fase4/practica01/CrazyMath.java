package certificacion.fase4.practica01;

public class CrazyMath {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int dx, dy;
        try {
            dx = x % 5;
            dy = y / dx;
        } catch (ArithmeticException e) {
            System.out.println("Caught AE");
            dx = 2;
            dy = y / dx;
        }
        x = x / dx;
        y = y / dy;
        System.out.println(dx + " " + dy);
        System.out.println(x + " " + y);


    }
}
