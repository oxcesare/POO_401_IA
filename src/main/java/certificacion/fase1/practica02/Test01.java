package certificacion.fase1.practica02;

public class Test01 {
    public static void main(String[] args) {

        int k = m1(args.length);
        k += 3 + ++k;
        System.out.println(k);


    }

    public static int m1(int i){
        return ++i;
    }
}
