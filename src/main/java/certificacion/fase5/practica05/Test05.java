package certificacion.fase5.practica05;

public class Test05 {

    private int j;

    void showJ() {
        while (j <= 5) {
            for (int j = 1; j <= 5; ) {
                System.out.println(j + " ");
                j++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        new Test05().showJ();

    }

}
