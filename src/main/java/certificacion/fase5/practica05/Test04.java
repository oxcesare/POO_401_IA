package certificacion.fase5.practica05;

public class Test04 {

    int x = 5;

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        Test04 t = new Test04();
        t.looper();
        System.out.println(t.x);
    }

    public void looper() {
        int x = 0;
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m++) {
                x = m;
            }
        }
    }
}
