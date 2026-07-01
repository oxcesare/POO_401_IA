package certificacion.fase19.interfaces.funcionales;

@FunctionalInterface
public interface OperacionMatematica {
    int calcular(int a, int b);
}

class Test{

    public static void main(String[] args) {
        OperacionMatematica suma = (a,b) -> a+b;
        System.out.println(suma.calcular(5, 3));

        //implementar esta interface funcional suma en un stream
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado = java.util.Arrays.stream(numeros).reduce(0, suma::calcular);
        System.out.println(resultado);

    }
}
