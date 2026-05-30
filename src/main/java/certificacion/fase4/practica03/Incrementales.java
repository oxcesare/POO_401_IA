package certificacion.fase4.practica03;

public class Incrementales {
    public static void main(String[] args) {
        int s =5;
        //++s es in pre incremento
        s += s + mx(s) + ++s;
        System.out.println(s);
    }

    static int mx(int s) {

        for (int i = 0; i < 3; i++) {
            s = s + i;
        }

        return s;

    }
}
