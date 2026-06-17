package certificacion.fase5.practica04;

public class Test5 {

    static int[] data = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        for (int i : data) {
            if (i < 2) {
                continue;
            }
            System.out.println(i);
            if (i == 3) {
                break;
            }
        }


    }
}
