package certificacion.fase2.practica05;

public class Test2 {
    public static void main(String[] args) {
        int value = 1000000;

        switch (value) {
            case 1_000_000:
                System.out.println("Value is one million");
                break;
            case 100000:
                System.out.println("Value is something else");
                break;
        }
    }
}
