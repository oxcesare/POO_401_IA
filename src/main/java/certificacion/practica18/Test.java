package certificacion.practica18;

public class Test {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", "12345", 20);
        Alumno alumno2 = new Alumno("Maria", "67890", 22);

        System.out.println(alumno1);
        System.out.println(alumno2);

        int comparisonResult = alumno1.compare(alumno1, alumno2);
        if (comparisonResult < 0) {
            System.out.println(alumno1.getNombre() + " es menor que " + alumno2.getNombre());
        } else if (comparisonResult > 0) {
            System.out.println(alumno1.getNombre() + " es mayor que " + alumno2.getNombre());
        } else {
            System.out.println(alumno1.getNombre() + " y " + alumno2.getNombre() + " tienen la misma edad");
        }
    }
}
