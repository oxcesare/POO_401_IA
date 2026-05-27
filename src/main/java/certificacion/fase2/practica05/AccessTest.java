package certificacion.fase2.practica05;

public class AccessTest {
    String a ="x";
    static char b='x';
    String c = "x";
    int d;

    class Inner{
        String a ="y";
        String get(){
            String c= "temp";
            //Line 1
            return c;
        }
    }
    AccessTest(){
        System.out.println(new Inner().get());
    }

    public static void main(String[] args) {
        new AccessTest();
    }
}

/**
 * c = c;
 * c = this.a;
 * c = ""+AccessTest.b
 * c = AccessTest.this.a
 * c = ""+b;
 */