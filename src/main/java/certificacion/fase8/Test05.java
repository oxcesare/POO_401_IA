package certificacion.fase8;

public class Test05 {

    static char c;
    public static void main(String[] args) {

        System.out.println("Valor inicial de char " + " " +  c);

        int k = 0;
        int m = 0;
        for (int i = 0; i <= 3; i++) {
            k++;
            if (i == 2) {
                break;
            }
            m++;
        }

        System.out.println(k + " , " + m);
    }
}
