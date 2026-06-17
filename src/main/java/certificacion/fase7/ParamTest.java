package certificacion.fase7;

public class ParamTest {

    public static void printSum(int a, int b) {
        System.out.println("In int " + (a + b));
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println("In Integer " + (a + b));
    }

    public static void printSum(double a, double b) {
        System.out.println("In double " + (a + b));
    }

    public static void main(String[] args) {
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(1);

        printSum(1, 3);
        printSum(a, b);
    }


}
