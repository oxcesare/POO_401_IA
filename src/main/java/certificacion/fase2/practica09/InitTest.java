package certificacion.fase2.practica09;

public class InitTest {

    static int si = 10;
    int i;
    //la variables finales se deben inicializar
    //final boolean bool;
    final boolean bool = true;

    InitTest() {
        si += 10;
        System.out.println("si" + " " + si);
    }


    {
        i = 1000;
        System.out.println(i);
    }

    {
        i = 2000;
        System.out.println(i);
    }


    public static void main(String[] args) {

        InitTest initTest = new InitTest();
    }
}
