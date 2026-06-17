package certificacion.fase5.practica04;

public class Test2 {
    public static void main(String[] args) {

        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) continue;
            sum += count;
        } while (count++ < 11);
        System.out.println(sum);

    }
}
