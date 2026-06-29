package certificacion.fase16.practica02;

@FunctionalInterface
interface Operacion {

    int aplicar(int a, int b);

    // Los metodos default y static no rompen la regla de "una sola abstraccion".
    default String descripcion() {
        return "Operacion matematica entre dos enteros";
    }

    static Operacion multiplicacion() {
        return (a, b) -> a * b;
    }
}

public class Test {

    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b;
        Operacion resta = (a, b) -> a - b;
        Operacion multiplicacion = Operacion.multiplicacion();

        System.out.println("Suma: " + calcular(10, 5, suma));
        System.out.println("Resta: " + calcular(10, 5, resta));
        System.out.println("Multiplicacion: " + calcular(10, 5, multiplicacion));
        System.out.println("Descripcion: " + suma.descripcion());
    }

    private static int calcular(int a, int b, Operacion operacion) {
        return operacion.aplicar(a, b);
    }
}
