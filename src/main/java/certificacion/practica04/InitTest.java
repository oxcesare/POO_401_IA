package certificacion.practica04;

public class InitTest {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a += (a=4);
        b = b + (b=5);
        System.out.println(a);
        System.out.println(b);


    }
}
