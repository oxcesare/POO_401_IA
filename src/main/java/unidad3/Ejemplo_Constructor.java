package unidad3;

public class Ejemplo_Constructor {

    public Ejemplo_Constructor() {
        System.out.println("El metodo que inicializa la clase ");
    }

    static {
        System.out.println("bloques estaticos ");
    }


    public static void main(String[] args) {

        Ejemplo_Constructor c = new Ejemplo_Constructor();

    }
}
