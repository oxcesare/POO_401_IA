package certificacion.fase3.practica02;

public class Bloques {

    private static int loop = 15;
    static final int INTERVAL = 10;

    static {
        System.out.println("Lo ejecuta primero ");
        loop = 1;
        System.out.println(loop);

    }

    Bloques() {
        System.out.println("Esto va después");
    }

    public static void main(String[] args) {
        Bloques b = new Bloques();
        Bloques c = new Bloques();
        Bloques d = new Bloques();
        Bloques e = b;
        b = null;


        float f = -123;
        long g = 012;
        short s = 12;
    }
}
