package certificacion.fase16.interfaces;


//Ejemplo de interface funcional Predicate
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        if(isEven.test(2)){
            System.out.println("Es par");
        }
    }
}
