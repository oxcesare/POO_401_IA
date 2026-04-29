package certificacion.practica07;

public class Test {


    // Nueva funcionalidad de Switch en Java 14+ con etiquetas de caso múltiples y expresiones lambda
    // 
    public static void main(String[] args) {
        Integer x = 3;
        switch (x) {
            case 1, 2 -> System.out.println("A");
            case 3, 4 -> System.out.println("B");
            default -> System.out.println("C");
        }
    }
}
