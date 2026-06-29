package certificacion.fase16.interfaces;

import java.util.function.Consumer;

public class Test01 {
    public static void main(String[] args) {


        //Ejemplo de Consumer
        Consumer<String> print = (s) -> System.out.println(s);
        print.accept("Hola, mundo!");

    }
}
