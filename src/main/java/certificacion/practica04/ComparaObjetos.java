package certificacion.practica04;

public class ComparaObjetos {

    public static void main(String[] args) {

        Object obj1 = new String("Hola");
        Object obj2 = new String("hola");

        if (obj1.equals(obj2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        if (obj1 == obj2) {
            System.out.println("Son iguales");
        }
    }
}
