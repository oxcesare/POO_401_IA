package certificacion.fase2.practica06;

public class A {

    static int si = 10;
    int i;
    final boolean bool = true;

    {
        si = 5;
        i = bool ? 1000 : 2000;

    }


    A() {
        si += 10;
    }

    public static void main(String[] args) {

    }

}
