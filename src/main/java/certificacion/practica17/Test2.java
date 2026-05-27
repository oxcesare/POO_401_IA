package certificacion.practica17;

public class Test2 {

    public static void main(String[] args) {
        byte starting = 3;
        short firstValue = 5;
        int secondeValue = 7;
        int functionValue = (int) (starting / 2 + firstValue / 2 + (int) firstValue / 3) + secondeValue / 2;

        System.out.println(functionValue);
    }
}
/**
 * 1 + 2 + 1 +  3
 *
 */