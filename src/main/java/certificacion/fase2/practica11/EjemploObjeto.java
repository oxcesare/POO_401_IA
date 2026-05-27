package certificacion.fase2.practica11;

public class EjemploObjeto {

    public static void main(String[] args) {

        Integer a = Integer.valueOf(10);

        System.out.println("Nombre de la super clase " + " " + a.getClass().getSuperclass().getName());

        String texto = "Hola";

        System.out.println("Nombre de la super clase " + " " + texto.getClass().getSuperclass().getName());
    }
}
