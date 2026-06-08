package certificacion.fase5.practica02;

public class Inicializadores {

    static String x;

    public static void main(String[] args) {

        //Los arreglos se crean de izquierda a derecha

        int[] a[] = new int[1][5];
        int b[][] = new int[1][5];
        int[] c[] = new int[1][];
        int[][] d = new int[5][];


        System.out.println(x);

        System.out.println("*******************");

        Inicializadores sc = new Inicializadores();
        sc.demoString();
        sc.demoBoleanos();


    }

    public void demoString() {
        int index = 1;
        String[] strArr = new String[5];
        String myStr = strArr[index];
        System.out.println(myStr);
    }

    public void demoBoleanos() {

        boolean[] b1 = new boolean[2];
        System.out.println(b1[0]);
        System.out.println(b1[1]);


    }
}
