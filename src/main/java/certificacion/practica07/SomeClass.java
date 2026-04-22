package certificacion.practica07;

public class SomeClass {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No se han pasado argumentos");
        } else {
            System.out.println("El primer argumento es: " + args[0]);
        }

    }
}
